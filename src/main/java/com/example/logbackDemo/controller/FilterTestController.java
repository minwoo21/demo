package com.example.logbackDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterTestController {

    private final Logger LOGGER = LoggerFactory.getLogger(FilterTestController.class);

    @PostMapping("filter-test")
    public void logTest() {
        LOGGER.trace("Trace Log");
        LOGGER.debug("Debug Log test");
        LOGGER.info("Info Log");
        LOGGER.warn("Warn Log test");
        LOGGER.error("Error Log");
    }

}