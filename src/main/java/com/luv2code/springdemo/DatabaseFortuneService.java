package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    public String getFortune() {
        return "Connected to the Database. The database is empty, so no fortune for you";

    }
}
