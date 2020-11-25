package main.java.team.animal_games.situation.time;

import java.util.Map;

/**
 * @ClassName Morning
 * @Description //TODO
 * @Author poros
 * @Date 2020/11/24 23:12
 **/
public class Morning extends TimePeriod {
    public Morning() {
        temperatureAffect = (int) (-1 + Math.random() * 3);
        visibilityAffect = 1;
        System.out.println("Morning::Morning is called!");
    }

    public Map<String, Integer> getTime() {
        temperatureAffect = (int) (-1 + Math.random() * 3);
        visibilityAffect = 1;
        System.out.println("Morning::getTime()::randomly create temperatureAffect and visibilityAffect!");
        return super.getTime();
    }
}
