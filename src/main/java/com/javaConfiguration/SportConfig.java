package com.javaConfiguration;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:otherSport.properties")
//@ComponentScan("com.javaConfiguration")
public class SportConfig {

    @Bean
    public OtherFortuneService otherFortuneService(){
        OtherHappyFortuneService myFortuneService = new OtherHappyFortuneService();
        return myFortuneService;
    }

    @Bean
    public OtherCoach runningCoach(){
        RunningCoach myRunningCoach = new RunningCoach(otherFortuneService());
        return myRunningCoach;
    }

}
