package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyCoachService implements CoachServices {
    @Override
    public void coachServing() {
        System.out.println("Happy coaching now!");
    }

}
