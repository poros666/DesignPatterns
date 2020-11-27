package main.java.team.animal_games.Animal.Strategy;

import java.util.Map;

/**
 * @ClassName StrategyContext
 * @author Raven
 * @Description This class provides context for strategy.
 */
public class StrategyContext {
    private ActionStrategy actionStrategy;

    /**
     * Construct context for certain strategy
     * @param actionStrategy
     */
    public StrategyContext(ActionStrategy actionStrategy){
        this.actionStrategy = actionStrategy;
    }

    /**
     * Calculate contest points using different strategy.
     * @param statistics animal's character attributes.
     * @return weight for this contest.
     */
    public double doStrategy(Map statistics){
        return actionStrategy.doAction(statistics);
    }

}
