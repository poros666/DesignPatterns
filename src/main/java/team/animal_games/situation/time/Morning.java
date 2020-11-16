package team.top.animal_games.situation.time;

import java.util.Map;

public class Morning extends TimePeriod{
    public Morning(){
        temperatureAffect = (int) (-1+Math.random()*3);
        visibilityAffect = 1;
        System.out.println("Morning constructor is called!");
    }

    public Map<String, Integer> getTime() {
        temperatureAffect = (int) (-1+Math.random()*3);
        visibilityAffect = 1;
        System.out.println("Morning getTime() is called!");
        return super.getTime();
    }
}
