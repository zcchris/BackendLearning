package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    @Autowired
    @Qualifier("customCoachService")
    CoachServices service;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return "SwimCoah!";
    }

    @Override
    public void serve() {
        this.service.coachServing();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
