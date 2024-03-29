package com.test.batch;

import lombok.extern.java.Log;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component
@Log
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {
    @Override
    public void afterJob(JobExecution jobExecution) {
        super.afterJob(jobExecution);
        log.info("After job execution");
    }

    @Override
    public void beforeJob(JobExecution jobExecution) {
        log.info("Before job execution");
        super.beforeJob(jobExecution);
    }
}

