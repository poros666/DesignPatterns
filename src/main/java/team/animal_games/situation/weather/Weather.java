package main.java.team.animal_games.situation.weather;

import java.util.HashMap;
import java.util.Map;

public abstract class Weather {
    protected int temperature;
    protected int visibility;

    public Weather() {
        temperature = 0;
        visibility = 0;
        System.out.println("Weather constructor is called!");
    }

    public Map<String, Integer> getWeather() {
        Map<String, Integer> data = new HashMap<>();
        data.put("temperature", temperature);
        data.put("visibility", visibility);
        System.out.println("Weather getWeather() is called!");
        return data;
    }
}
