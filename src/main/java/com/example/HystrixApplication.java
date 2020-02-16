package com.example;

import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HystrixApplication {
    private static final Logger LOG = LoggerFactory.getLogger(HystrixApplication.class);

    public static void main(String[] args) {
        LOG.info("Starting Micronaut based Application");
        Micronaut.run(HystrixApplication.class);
    }
}