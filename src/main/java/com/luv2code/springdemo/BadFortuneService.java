package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService{

    public String getFortune() {
        return "You will lose today";
    }
}
