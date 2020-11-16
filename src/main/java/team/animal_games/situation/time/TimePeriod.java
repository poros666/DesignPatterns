package main.java.team.animal_games.situation.time;

import java.util.HashMap;
import java.util.Map;

public abstract class TimePeriod {
    protected int temperatureAffect;
    protected int visibilityAffect;

    public TimePeriod() {
        temperatureAffect = 0;
        visibilityAffect = 0;
        System.out.println("TimePeriod constructor is called!");
    }

    public Map<String, Integer> getTime() {
        Map<String, Integer> data = new HashMap<>();
        data.put("temperatureAffect", temperatureAffect);
        data.put("visibilityAffect", visibilityAffect);
        System.out.println("TimePeriod getTime() is called!");
        return data;
    }
}
