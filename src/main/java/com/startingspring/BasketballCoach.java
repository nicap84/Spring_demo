package com.startingspring;

public class BasketballCoach implements Coach{

    private FortuneService fortuneService;

    private String mail;
    private String team;

    //Create a no-arguments constructor
    public BasketballCoach() {
        System.out.println("BasketballCoach : inside no-arguments constructor");
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("BasketballCoach : inside settermethod constructor");
        this.fortuneService = fortuneService;
    }

    public void setMail(String mail){
        System.out.println("BasketballCoach : inside settermethod mail");
        this.mail = mail;
    };
    public void setTeam(String team){
        System.out.println("BasketballCoach : inside settermethod team");
        this.team = team;
    };

    public String getMail(){
        return mail;
    };
    public String getTeam(){
        return team;
    };

    @Override
    public String getDailyWorkout() {
        return "Practice your basketball skills for 2 hours today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
