package main.java.team.animal_games.Animal.Strategy;

import java.util.Map;

/**
 * @author Raven
 */
public class StrategyContext {
    private ActionStrategy actionStrategy;

    public StrategyContext(ActionStrategy actionStrategy){
        this.actionStrategy = actionStrategy;
    }

    public double doStrategy(Map statistics){
        return actionStrategy.doAction(statistics);
    }

}
