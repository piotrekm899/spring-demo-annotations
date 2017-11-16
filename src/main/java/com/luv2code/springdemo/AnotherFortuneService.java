package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class AnotherFortuneService implements FortuneService {

    public String getFortune() {
        return "Another fortune teller...";
    }
}
