package main.java.team.animal_games.situation.weather;

import java.util.Map;

public class FoggyDay extends Weather {
    public FoggyDay() {
        temperature = (int) (13 + Math.random() * 15);
        visibility = (int) (-2 + Math.random());
        System.out.println("FoggyDay constructor is called!");
    }

    public Map<String, Integer> getWeather() {
        temperature = (int) (13 + Math.random() * 15);
        visibility = (int) (-2 + Math.random());
        System.out.println("FoggyDay getWeather() is called!");
        return super.getWeather();
    }
}
