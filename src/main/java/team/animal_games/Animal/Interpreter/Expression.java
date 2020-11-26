package main.java.team.animal_games.Animal.Interpreter;

/**
 * @author Raven
 */
public interface Expression {
    /**
     * Returns judgement for the expression
     * @param context
     * @return
     */
    public boolean interpret(String context);
}
