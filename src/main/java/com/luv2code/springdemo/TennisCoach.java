package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public String getDailyWorkout() {
        return "Bounce the ball three times";

    }
}
