package com.annotaionsspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//Constructor injection is tricky with qualifiers,
//You have to place the @Qualifier annotation inside of the constructor arguments.
public class TennisCoach implements NewCoach{

    //Construction injection with annotations
    private NewFortuneService newFortuneService;
    @Autowired
    public TennisCoach(NewFortuneService newFortuneService){
        this.newFortuneService = newFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "blablabla Tenis coach";
    };

    @Override
    public String getFortune(){
        return newFortuneService.getFortune();
    }

}
