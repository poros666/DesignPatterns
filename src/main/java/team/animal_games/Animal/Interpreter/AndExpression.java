package main.java.team.animal_games.Animal.Interpreter;

/**
 * @author Raven
 */
public class AndExpression implements Expression{
    private Expression animals;
    private Expression actions;

    public AndExpression(Expression animals, Expression actions){
        this.animals = animals;
        this.actions = actions;
    }

    @Override
    public boolean interpret(String context) {
        return animals.interpret(context) && actions.interpret(context);
    }
}
