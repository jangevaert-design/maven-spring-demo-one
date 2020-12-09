package edu.cnm.deepdive.springdemo;

public class MotorcycleCoach implements Coach {

  private FortuneService fortuneService;

  public MotorcycleCoach(FortuneService ThefortuneService) {
    fortuneService = ThefortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Ride Route 66!";
  }

  @Override
  public String getDailyFortune() {
    return "Never forget: " + fortuneService.getFortune();
  }
}
