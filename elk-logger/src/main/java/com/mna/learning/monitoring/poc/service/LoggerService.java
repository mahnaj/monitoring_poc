package com.mna.learning.monitoring.poc.service;


import com.mna.learning.monitoring.poc.model.LogModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static net.logstash.logback.argument.StructuredArguments.fields;

@Service
public class LoggerService {
    private static final Logger logger = LoggerFactory.getLogger(LoggerService.class);

    public void pushLog(LogModel logModel) {
        logger.info("push log {}", fields(logModel));
    }

    public void pushErrorLog(LogModel logModel) {
        logger.error("push error log {}", fields(logModel));
    }
}
