package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("tennisCoach",TennisCoach.class);
        Coach yourCoach = context.getBean("tennisCoach",TennisCoach.class);

        System.out.println(myCoach==yourCoach);
        System.out.println(myCoach);
        System.out.println(yourCoach);

        context.close();

    }
}
