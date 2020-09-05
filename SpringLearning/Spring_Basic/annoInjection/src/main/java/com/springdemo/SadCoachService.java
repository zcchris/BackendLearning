package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadCoachService implements CoachServices{
    @Override
    public void coachServing() {
        System.out.println("Sad coaching now...");
    }
}
