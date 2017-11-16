package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(coach.getDailyWorkout());
        //System.out.println(coach.getDailyFortune());
        //System.out.println(coach.getTeam());
        //System.out.println(coach.getEmail());

        context.close();
    }

}
