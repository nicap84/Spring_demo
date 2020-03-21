package com.annotaionsspring;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements NewFortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
