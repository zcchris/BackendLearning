package com.springdemo;

import org.springframework.stereotype.Component;

@Component("customCoachService")
public class CUSTOMCoachService implements CoachServices {
    @Override
    public void coachServing() {
        System.out.println("CUTOM coaching now!");
    }
}
