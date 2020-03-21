package com.startingspring;

public class FutbolCoach implements Coach {

    private RandomFortuneService randomFortune = new RandomFortuneService();

    public FutbolCoach(RandomFortuneService randomFortune) {
        this.randomFortune = randomFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your futbol skills for 3 hours today";
    }

    @Override
    public String getDailyFortune() {
        return randomFortune.getFortune();
    }
}
