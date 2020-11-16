package team.top.animal_games.situation.weather;

import java.util.Map;

public class SunnyDay extends Weather{
    public SunnyDay(){
        temperature = (int) (25+Math.random()*10);
        visibility = (int) (3+Math.random());
        System.out.println("SunnyDay constructor is called!");
    }

    public Map<String, Integer> getWeather() {
        temperature = (int) (25+Math.random()*10);
        visibility = (int) (3+Math.random());
        System.out.println("SunnyDay getWeather() is called!");
        return super.getWeather();
    }
}
