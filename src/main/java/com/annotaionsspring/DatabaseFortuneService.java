package com.annotaionsspring;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements NewFortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
