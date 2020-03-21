package com.javaConfiguration;

import org.springframework.beans.factory.annotation.Value;

public class RunningCoach implements OtherCoach {

    private OtherFortuneService otherFortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public RunningCoach(OtherFortuneService otherFortuneService){
        this.otherFortuneService = otherFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("Email: " + email + " team: " + team);
        return "Balblabla Running";
    }

    @Override
    public String getFortune() {
        return otherFortuneService.getFortune();
    }
}
