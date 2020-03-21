package com.annotaionsspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements NewCoach{

    private NewFortuneService newFortuneService;

    public GolfCoach(){}

    //Setter injection with annotations
    @Autowired
    @Qualifier("newHappyFortuneService")
    public void setNewFortuneService (NewFortuneService newFortuneService) {
        this.newFortuneService = newFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Blablabla Golf";
    }

    @Override
    public String getFortune() {
        return newFortuneService.getFortune() + " in Golf";
    }
}
