package edu.cnm.deepdive.springdemo;

import javax.sound.midi.Track;

public class MyApp {

  public static void main(String[] args) {
    Coach theCoach = new TrackCoach();
    System.out.println(theCoach.getDailyWorkout());
  }
}
