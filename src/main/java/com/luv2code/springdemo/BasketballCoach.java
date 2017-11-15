package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {
    public String getDailyWorkout() {
        return "Practice two-step shot until you master it";
    }

    public String getDailyFortune() {
        return null;
    }
}
