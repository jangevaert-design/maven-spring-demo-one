package edu.cnm.deepdive.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {

    // load the configuration file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    //retrieve beans from the spring container
    CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
    //call methods on the bean
    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.getDailyFortune());
    //close context
    context.close();
  }
}
