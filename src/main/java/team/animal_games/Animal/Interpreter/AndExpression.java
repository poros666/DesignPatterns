package main.java.team.animal_games.Animal.Interpreter;

/**
 * @author Raven
 * @Description construct and interpreter.
 */
public class AndExpression implements Expression{
    private Expression expr1;
    private Expression expr2;

    /**
     * Construct AND interpreter using two expressions.
     * @param expr1
     * @param expr2
     */
    public AndExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
