package main.java.team.animal_games.Animal.Strategy;

import java.util.Map;

/**
 * @author Raven
 */
public interface ActionStrategy {
    /**
     * This interface provides animal's behavior in certain competition.
     * @param statistics represent animal's character attributes.
     * @return animal's weight in this context.
     */
    public double doAction(Map<String, Integer> statistics);
}
