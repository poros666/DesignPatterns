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
    private TimePeriod _time;
    private Weather _weather;

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
        System.out.println("Situation::Situation is called!");
    }

    public Situation() {
        this("Morning", "SunnyDay");
    }

    public Map<String, Integer> getSituation() {
        Map<String, Integer> data = new HashMap<>();
        Map<String, Integer> weatherM = _weather.getWeather();
        Map<String, Integer> timeM = _time.getTime();
        data.put("temperature", weatherM.get("temperature") + timeM.get("temperatureAffect"));
        data.put("visibility", weatherM.get("visibility") + timeM.get("visibilityAffect"));
        return data;
    }
}
