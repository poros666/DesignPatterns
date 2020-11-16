package team.top.animal_games.situation.weather;

import java.util.Map;

public class RainyDay extends Weather{
    public RainyDay(){
        temperature = (int) (10+Math.random()*15);
        visibility = (int) (1+Math.random());
        System.out.println("RainyDay constructor is called!");
    }

    public Map<String, Integer> getWeather() {
        temperature = (int) (10+Math.random()*15);
        visibility = (int) (1+Math.random());
        System.out.println("RainyDay getWeather() is called!");
        return super.getWeather();
    }
}
