package main.java.team.animal_games.situation.time;

import java.util.Map;

/**
 * @ClassName Afternoon
 * @Description //TODO
 * @Author poros
 * @Date 2020/11/24 23:12
 **/
public class Afternoon extends TimePeriod {
    //constructor
    public Afternoon() {
        temperatureAffect = (int) (-2 + Math.random() * 3);
        visibilityAffect = -1;
        System.out.println("Afternoon::Afternoon() is called!");
    }

    //获得时间状况
    public Map<String, Integer> getTime() {
        temperatureAffect = (int) (-2 + Math.random() * 3);
        visibilityAffect = -1;
        System.out.println("Afternoon::getTime()::randomly create temperatureAffect and visibilityAffect!");
        return super.getTime();
    }
}
