package com.codepianist.springbatch;

import lombok.AllArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class RunJob {

    private Job job;
    private JobLauncher jobLauncher;

    public void runJob() throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
        JobParameters jobParameters= new JobParametersBuilder()
                .addString("parameter1", "first")
                .toJobParameters();
        jobLauncher.run(this.job, jobParameters);
    }

}
