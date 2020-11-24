package main.java.team.animal_games.situation.weather;

import java.util.Map;

/**
 * @ClassName SunnyDay
 * @Description //TODO
 * @Author poros
 * @Date 2020/11/24 23:08
 **/
public class SunnyDay extends Weather {
    public SunnyDay() {
        temperature = (int) (25 + Math.random() * 10);
        visibility = (int) (3 + Math.random());
        System.out.println("SunnyDay::SunnyDay() is called!");
    }

    public Map<String, Integer> getWeather() {
        temperature = (int) (25 + Math.random() * 10);
        visibility = (int) (3 + Math.random());
        System.out.println("SunnyDay::getWeather()::randomly set temperature and visibility!");
        return super.getWeather();
    }
}
