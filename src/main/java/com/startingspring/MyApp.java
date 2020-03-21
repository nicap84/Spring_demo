package com.startingspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main (String args[]) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from de spring container
        Coach theCoach = context.getBean("myBaseballCoach", Coach.class);
        BasketballCoach theBasketballCoach = context.getBean("myBasketballCoach", BasketballCoach.class);
        Coach theFutbolCoach = context.getBean("myFutbolCoach", Coach.class);


        //call methods of the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theBasketballCoach.getDailyWorkout());
        System.out.println(theBasketballCoach.getDailyFortune());
        System.out.println("Mail " + theBasketballCoach.getMail() + " and team " + theBasketballCoach.getTeam());

        System.out.println("Daily fortune: " + theFutbolCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
