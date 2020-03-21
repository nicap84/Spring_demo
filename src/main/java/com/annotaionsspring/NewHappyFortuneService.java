package com.annotaionsspring;

import com.annotaionsspring.NewFortuneService;
import org.springframework.stereotype.Component;

@Component
public class NewHappyFortuneService implements NewFortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
