package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach{

    @Autowired
    @Qualifier("badFortuneService")
    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "hit the ball twice today";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
