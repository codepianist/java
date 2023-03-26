package com.codepianist.springbatch.cfg;

import com.codepianist.springbatch.StringLocalDateFieldsetMapper;
import com.codepianist.springbatch.model.AssetProcessor;
import com.codepianist.springbatch.model.entity.AssetEntity;
import lombok.Value;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.util.Map;

@EnableJpaRepositories
@EnableTransactionManagement
@EnableBatchProcessing
@Configuration
public class BatchConfig {

    @Bean
    public FlatFileItemReader reader() {
        return new FlatFileItemReaderBuilder<>().name("pricesReader")
                .resource(new ClassPathResource("prices.csv"))
                .delimited()
                .names(new String[]{"label", "moment", "hit", "price"})
                .fieldSetMapper(new BeanWrapperFieldSetMapper<>() {{
                    setCustomEditors(Map.of(new StringLocalDateFieldsetMapper<>()));
                    setTargetType(AssetEntity.class);
                }})
                .build();
    }

    @Bean
    public JdbcBatchItemWriter writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO asset_prices (label, moment, hit, price) VALUES (:label, :moment, :hit, :price)")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public AssetProcessor assetProcessor() {
        return new AssetProcessor();
    }

    @Bean
    public Job importUserJob(Step step1, JobRepository jobRepository) {
        return new JobBuilder("importUserJob", jobRepository)
                //.incrementer(new RunIdIncrementer())
                //.listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter writer, JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("importUserJob", jobRepository)
                .<String[], AssetEntity>chunk(10, transactionManager)
                .reader(reader())
                .processor(assetProcessor())
                .writer(writer)
                .build();
    }


    @Bean
    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) throws MalformedURLException {
        ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
        databasePopulator.addScript(getResource("org/springframework/batch/core/schema-drop-mariadb.sql"));
        databasePopulator.addScript(getResource("org/springframework/batch/core/schema-mariadb.sql"));
        databasePopulator.setIgnoreFailedDrops(true);

        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource);
        initializer.setDatabasePopulator(databasePopulator);

        return initializer;
    }

    private Resource getResource(String location) {
        return new DefaultResourceLoader().getResource(location);
    }

}