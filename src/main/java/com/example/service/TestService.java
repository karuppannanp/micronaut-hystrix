package com.example.service;

import javax.inject.Singleton;

import io.micronaut.configuration.hystrix.annotation.HystrixCommand;

@Singleton
public class TestService {

    @HystrixCommand(value = "test-hystrix")
    public String sleep(String timeInMs) {
        try {
            Thread.sleep(Long.valueOf(timeInMs));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
