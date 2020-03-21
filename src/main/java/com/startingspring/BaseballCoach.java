package com.startingspring;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your baseball skills for 1 hours today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //add an init method
    public void doInit () {
        System.out.println("BaseballCoach: init method");
    }

    //add a destroy method
    public void doDestroy () {
        System.out.println("BaseballCoach: destroy method");
    }

}
