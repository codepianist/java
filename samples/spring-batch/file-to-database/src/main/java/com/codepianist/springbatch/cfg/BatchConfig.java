package com.codepianist.springbatch.cfg;

import com.codepianist.springbatch.model.AssetProcessor;
import com.codepianist.springbatch.model.entity.AssetEntity;
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
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
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
import java.time.format.DateTimeFormatter;

@EnableJpaRepositories
@EnableTransactionManagement
@EnableBatchProcessing
@Configuration
public class BatchConfig {

    @Bean
    public FlatFileItemReader reader(FieldSetMapper fieldSetMapper) {
        return new FlatFileItemReaderBuilder<>().name("pricesReader")
                .resource(new ClassPathResource("prices.csv"))
                .delimited()
                .names(new String[]{"label", "moment", "hit", "price"})
                .fieldSetMapper(fieldSetMapper)
//                .fieldSetMapper(new BeanWrapperFieldSetMapper<>() {
//                    @Override
//                    protected void initBinder(DataBinder binder) {
//                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//                        binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
//                            @Override
//                            public void setAsText(String text) throws IllegalArgumentException {
//                                if (StringUtils.isNotEmpty(text)) {
//                                    setValue(LocalDate.parse(text, formatter));
//                                } else {
//                                    setValue(null);
//                                }
//                            }
//
//                            @Override
//                            public String getAsText() throws IllegalArgumentException {
//                                Object date = getValue();
//                                if (date != null) {
//                                    return formatter.format((LocalDate) date);
//                                } else {
//                                    return "";
//                                }
//                            }
//                        });
//                    }
//                })
                .build();
    }

    @Bean
    public ConversionService localDateConversionService() {
        DefaultConversionService testConversionService = new DefaultConversionService();
        DefaultConversionService.addDefaultConverters(testConversionService);
        testConversionService.addConverter(new Converter<String, LocalDate>() {
            @Override
            public LocalDate convert(String text) {
                return LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            }
        });
        return testConversionService;
    }

    @Bean
    public FieldSetMapper<AssetEntity> classRowMapper(ConversionService conversionService) {
        BeanWrapperFieldSetMapper<AssetEntity> mapper = new BeanWrapperFieldSetMapper<>();
        mapper.setConversionService(conversionService);
        mapper.setTargetType(AssetEntity.class);
        return mapper;
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
    public Step step1(FieldSetMapper fieldSetMapper, JdbcBatchItemWriter writer, JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("importUserJob", jobRepository)
                .<String[], AssetEntity>chunk(10, transactionManager)
                .reader(reader(fieldSetMapper))
                .processor(assetProcessor())
                .writer(writer)
                .build();
    }


    @Bean
    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) throws MalformedURLException {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(getResource("org/springframework/batch/core/schema-drop-mariadb.sql"));
        populator.addScript(getResource("org/springframework/batch/core/schema-mariadb.sql"));
        populator.setIgnoreFailedDrops(true);

        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource);
        initializer.setDatabasePopulator(populator);

        return initializer;
    }

    private Resource getResource(String location) {
        return new DefaultResourceLoader().getResource(location);
    }

}