package main.java.team.animal_games.situation;

import main.java.team.animal_games.situation.time.Afternoon;
import main.java.team.animal_games.situation.time.Morning;
import main.java.team.animal_games.situation.time.TimePeriod;
import main.java.team.animal_games.situation.weather.FoggyDay;
import main.java.team.animal_games.situation.weather.RainyDay;
import main.java.team.animal_games.situation.weather.SunnyDay;
import main.java.team.animal_games.situation.weather.Weather;

import java.util.HashMap;
import java.util.Map;

public class Situation {
    //此处使用了设计模式：Facade Pattern
    //将天气和时间两个子系统利用Situation这个类包装起来，以便快速的获取 温度和能见度 这两个 和 天气及时间 都相关的属性
    //这样为了获取温度和能见度，外界不再需要与连哥哥子系统耦合，而只需要通过外观类获取信息和操作

    private TimePeriod _time;
    private Weather _weather;

    //随机生成天气和时间
    public Situation(String time, String weather) {

        if (weather == "RainyDay") {
            _weather = new RainyDay();
        } else if (weather == "FoggyDay") {
            _weather = new FoggyDay();
        } else {
            _weather = new SunnyDay();
        }

        if (time == "Morning") {
            _time = new Morning();
        } else {
            _time = new Afternoon();
        }
        System.out.println("Situation::Situation() is called!");
    }

    //无参数构造，默认情况早晨大晴天
    public Situation() {
        this("Morning", "SunnyDay");
    }

    //以Map<String, Integer>形式返回温度和能见度
    //此处使用了设计模式：Strategy Pattern
    //天气和时间都是策略类，根据不同的子类，将会执行不同的getWeather，getTime
    public Map<String, Integer> getSituation() {
        Map<String, Integer> data = new HashMap<>();
        Map<String, Integer> weatherM = _weather.getWeather();
        Map<String, Integer> timeM = _time.getTime();
        data.put("temperature", weatherM.get("temperature") + timeM.get("temperatureAffect"));
        data.put("visibility", weatherM.get("visibility") + timeM.get("visibilityAffect"));
        return data;
    }
}
