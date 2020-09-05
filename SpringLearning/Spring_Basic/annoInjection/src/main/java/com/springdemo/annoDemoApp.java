package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annoDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        coach.serve();
        System.out.println(coach.getEmail());
        context.close();
    }
}
