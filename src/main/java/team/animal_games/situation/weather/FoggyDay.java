package main.java.team.animal_games.situation.weather;

import java.util.Map;

/**
 * @ClassName FoggyDay
 * @Description //TODO
 * @Author poros
 * @Date 2020/11/24 23:13
 **/
public class FoggyDay extends Weather {
    public FoggyDay() {
        temperature = (int) (13 + Math.random() * 15);
        visibility = (int) (-2 + Math.random());
        System.out.println("FoggyDay::FoggyDay() is called!");
    }

    public Map<String, Integer> getWeather() {
        temperature = (int) (13 + Math.random() * 15);
        visibility = (int) (-2 + Math.random());
        System.out.println("FoggyDay::getWeather()::randomly set temperature and visibility!");
        return super.getWeather();
    }
}
