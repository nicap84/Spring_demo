package com.startingspring;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Bla bla bla track";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
