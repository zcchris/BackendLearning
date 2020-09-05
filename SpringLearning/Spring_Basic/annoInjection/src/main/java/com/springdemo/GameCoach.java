package com.springdemo;

public class GameCoach implements Coach {
    private CoachServices coachServices;
    public GameCoach(CoachServices theCoachService) {
        this.coachServices = theCoachService;
    }

    @Override
    public String getDailyWorkout() {
        return "from game coach-getDailyWorkout()";
    }

    @Override
    public void serve() {
        System.out.println("from game coach-serve()");
    }
}
