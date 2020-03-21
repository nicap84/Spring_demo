package com.annotaionsspring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements NewFortuneService{

    //Create an array of strings
    private String[] data = {"Beware og the wolf in sheep's clothes", "Diligence is the mother of good luck", "The journey is the reward"};
    private Random random = new Random();

    @Override
    public String getFortune() {
        //pick a randon string from the array
        int rNumber = random.nextInt(data.length);
        return data[rNumber];
    }
}
