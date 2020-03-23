package com.mna.learning.monitoring.poc.controller;

import com.mna.learning.monitoring.poc.model.LogModel;
import com.mna.learning.monitoring.poc.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/elk-logs")
public class LoggerController {

    private LoggerService loggerService;

    @Autowired
    public LoggerController(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    @GetMapping("/ping")
    public ResponseEntity ping(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/log", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity createLog(@RequestBody LogModel logModel){
        loggerService.pushLog(logModel);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PostMapping(value = "/log-error", consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity createErrorLog(@RequestBody LogModel logModel){
        loggerService.pushErrorLog(logModel);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
