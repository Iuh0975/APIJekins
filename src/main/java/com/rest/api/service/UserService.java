package com.rest.api.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
@ConfigurationProperties
@Validated
public class UserService {
    private int threadPool;
    private String email;

    public int getThreadPool() {

        return threadPool;
    }

    public void setThreadPool(int threadPool) {

        this.threadPool = threadPool;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void checkUser(){
        System.out.println("Thread Pool Service: " + threadPool);
        System.out.println("Email Service: " + email);
    }
}
