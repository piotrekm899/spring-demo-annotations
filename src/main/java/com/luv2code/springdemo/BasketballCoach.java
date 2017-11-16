package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach() {
        System.out.println("inside no-arg constructor of Basketball Coach");
    }

    @Autowired
    @Qualifier("anotherFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice two-step shot until you master it";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
