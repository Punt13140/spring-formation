package fr.univamu.dirnum.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements CoachInterface {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes !!!";
    }
}
