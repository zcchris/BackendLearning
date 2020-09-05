package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        // @Component & @ComponentScan
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        coach.getDailyWorkout();

        coach.serve();
        System.out.println(coach.getEmail() + " " + coach.getTeam());
        context.close();

        /** @Bean()
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        GameCoach coach = context.getBean("gameCoach", GameCoach.class);
        coach.serve();

        context.close();
         */
    }
}
