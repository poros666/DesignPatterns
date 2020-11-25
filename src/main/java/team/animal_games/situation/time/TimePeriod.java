package main.java.team.animal_games.situation.time;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TimePeriod
 * @Description 策略类
 * @Author poros
 * @Date 2020/11/24 23:03
 **/
public abstract class TimePeriod {
    //此处使用了设计模式：Strategy Pattern
    //天气和时间都是策略类，根据不同的子类，将会执行不同的getWeather，getTime
    protected int temperatureAffect;
    protected int visibilityAffect;

    public TimePeriod() {
        temperatureAffect = 0;
        visibilityAffect = 0;
        System.out.println("TimePeriod::TimePeriod() is called!");
    }

    public Map<String, Integer> getTime() {
        Map<String, Integer> data = new HashMap<>();
        data.put("temperatureAffect", temperatureAffect);
        data.put("visibilityAffect", visibilityAffect);
        System.out.println("TimePeriod::getTime()::out put temperatureAffect and visibilityAffect!");
        return data;
    }
}
