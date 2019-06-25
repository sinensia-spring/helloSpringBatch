package com.test.batch;

import lombok.extern.java.Log;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@Component
@Log
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

}
