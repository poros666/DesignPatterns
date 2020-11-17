package main.java.team.animal_games.situation.weather;

import java.util.Map;

public class RainyDay extends Weather {
    public RainyDay() {
        temperature = (int) (10 + Math.random() * 15);
        visibility = (int) (1 + Math.random());
        System.out.println("RainyDay::RainyDay() is called!");
    }

    public Map<String, Integer> getWeather() {
        temperature = (int) (10 + Math.random() * 15);
        visibility = (int) (1 + Math.random());
        System.out.println("RainyDay::getWeather() is called!");
        return super.getWeather();
    }
}
