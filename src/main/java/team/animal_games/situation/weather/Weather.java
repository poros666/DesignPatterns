package main.java.team.animal_games.situation.weather;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Weather
 * @Description 策略类
 * @Author poros
 * @Date 2020/11/24 23:04
 **/
public abstract class Weather {
    //此处使用了设计模式：Strategy Pattern
    //天气和时间都是策略类，根据不同的子类，将会执行不同的getWeather，getTime
    protected int temperature;
    protected int visibility;

    public Weather() {
        temperature = 0;
        visibility = 0;
        System.out.println("Weather::Weather() is called!");
    }

    public Map<String, Integer> getWeather() {
        Map<String, Integer> data = new HashMap<>();
        data.put("temperature", temperature);
        data.put("visibility", visibility);
        System.out.println("Weather::getWeather()::out put temperature and visibility!");
        return data;
    }
}
