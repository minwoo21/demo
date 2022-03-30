package com.example.logbackDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @PostMapping("log-test")
    public void logTest(){
        long startTime = System.currentTimeMillis();
        LOGGER.trace("Trace Log");
        LOGGER.debug("Debug Log");
        LOGGER.info("Info Log");
        LOGGER.warn("Warn Log");
        LOGGER.error("Error Log");
    }

    @PostMapping("log-test/{Parm}")
    public void logTestWithParm(@PathVariable String Parm) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        LOGGER.info("[getProduct] perform {} of Around Hub API.", "getProduct");
        TimeUnit.SECONDS.sleep(1);
        LOGGER.info( "[getProduct] Response :: {} Response Time = {}ms",Parm,(System.currentTimeMillis() - startTime));
    }


}