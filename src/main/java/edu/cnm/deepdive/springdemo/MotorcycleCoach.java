package edu.cnm.deepdive.springdemo;

public class MotorcycleCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Ride Route 66!";
  }

  @Override
  public String getDailyFortune() {
    return null;
  }
}
