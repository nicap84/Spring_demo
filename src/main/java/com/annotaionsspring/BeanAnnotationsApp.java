package com.annotaionsspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAnnotationsApp {

    public static void main (String args[]) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");

        //get the bean from de spring container
        NewCoach theCoach = context.getBean("swimmingCoach", NewCoach.class);

        //call methods of the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        //close the context
        context.close();

    }
}
