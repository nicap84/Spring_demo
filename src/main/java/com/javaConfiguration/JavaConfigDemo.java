package com.javaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

    public static void main (String args[]) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from de spring container
        OtherCoach theCoach = context.getBean("runningCoach", OtherCoach.class);

        //call methods of the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        //close the context
        context.close();

    }
}
