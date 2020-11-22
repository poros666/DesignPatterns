package main.java.team.animal_games.Animal.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raven
 */
public class StrategyTest {
    public static void main(String[] args){
        Map statistics = new HashMap();
        statistics.put("STR", 8);
        statistics.put("INT", 8);
        statistics.put("CON", 8);
        statistics.put("AGI", 8);
        statistics.put("MEN", 8);
        statistics.put("VIT", 8);
        statistics.put("LUK", 8);
        statistics.put("WIS", 8);
        StrategyContext context = new StrategyContext(new DoFly());
        double weight = context.doStrategy(statistics);
        System.out.println(weight);
    }
}
