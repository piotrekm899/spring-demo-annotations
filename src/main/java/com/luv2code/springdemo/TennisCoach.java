package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }

    @Value("${my.team}")
    private String team;
    @Value("${my.email}")
    private String email;

    @Autowired
    public TennisCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("creating Tennis Coach Obj");
    }

    public String getDailyWorkout() {
        return "Bounce the ball three times";
    }

    @PostConstruct
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
