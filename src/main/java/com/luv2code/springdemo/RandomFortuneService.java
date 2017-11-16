package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    public String getFortune() {
        return "random fortune";
    }
}
