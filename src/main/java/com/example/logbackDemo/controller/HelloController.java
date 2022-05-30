package com.example.logbackDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @PostMapping("log-test")
    public void logTest() {
        LOGGER.trace("Trace Log");
        LOGGER.debug("Debug Log test");
        LOGGER.info("Info Log");
        LOGGER.warn("Warn Log test");
        LOGGER.error("Error Log");
    }

}