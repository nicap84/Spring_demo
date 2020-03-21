package com.annotaionsspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements NewCoach {

    //Field injection with annotations
    @Autowired
    @Qualifier("fileFortuneService")
    private NewFortuneService newFortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimmingCoach(){}

    @Override
    public String getDailyWorkout() {
        System.out.println("Email: " + email + " Team: " + team);
        return "Balblabla Swimming";
    }

    @Override
    public String getFortune() {
        return newFortuneService.getFortune() + " in Swimming";
    }
}
