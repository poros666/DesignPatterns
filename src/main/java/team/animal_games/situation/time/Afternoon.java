package main.java.team.animal_games.situation.time;

import java.util.Map;

public class Afternoon extends TimePeriod {
    public Afternoon() {
        temperatureAffect = (int) (-2 + Math.random() * 3);
        visibilityAffect = -1;
        System.out.println("Afternoon::Afternoon() is called!");
    }

    public Map<String, Integer> getTime() {
        temperatureAffect = (int) (-2 + Math.random() * 3);
        visibilityAffect = -1;
        System.out.println("Afternoon::getTime() is called!");
        return super.getTime();
    }
}
