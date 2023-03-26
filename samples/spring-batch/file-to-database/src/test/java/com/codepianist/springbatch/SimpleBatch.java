package com.codepianist.springbatch;


import org.junit.jupiter.api.Test;
import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Map;

@SpringBootTest(classes = SimpleBatch.TestConfig.class)
class SimpleBatch {

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Test
    void test() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                .addParameter("outputText", new JobParameter("Hello Spring Batch", String.class))
                .toJobParameters();
        jobLauncherTestUtils.launchJob(jobParameters);
    }

    @Configuration
    @EnableJpaRepositories("com.codepianist")
    @EntityScan("com.codepianist")
    @EnableBatchProcessing
    static class TestConfig {

        @Bean
        public Job helloWorldJob(JobRepository jobRepository) {
            Step step = new StepBuilder("step", jobRepository)
                    .tasklet((contribution, chunkContext) -> {
                        Map<String, Object> jobParameters = chunkContext.getStepContext()
                                .getJobParameters();
                        Object outputText = jobParameters.get("outputText");
                        System.out.println(outputText);
                        return RepeatStatus.FINISHED;
                    }).build();

            return new JobBuilder("helloWorldJob", jobRepository)
                    .start(step)
                    .build();
        }

        @Bean
        public JobLauncherTestUtils utils() {
            return new JobLauncherTestUtils();
        }
    }
}
