package com.startingspring;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {"one fortune", "two fortunes", "three fortunes"};
    Random randomNumber = new Random();

    @Override
    public String getFortune() {
        int index = randomNumber.nextInt(fortunes.length);
        return fortunes[index];
    }
}
