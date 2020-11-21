package main.java.team.animal_games.Animal.Strategy;

import java.util.Map;

/**
 * @author Raven
 */
public class StrategyTest {
    public static void main(String[] args){
        Map statistics = null;
        statistics.put("STR", 8);
        StrategyContext context = new StrategyContext(new DoFly());
        double weight = context.doStrategy(statistics);
        System.out.println(weight);
    }
}
