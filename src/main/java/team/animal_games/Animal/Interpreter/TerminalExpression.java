package main.java.team.animal_games.Animal.Interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Raven
 * @Description Main interpreter for this method.
 */
public class TerminalExpression implements Expression{
    private Set<String> set = new HashSet<>();

    /**
     * Construct interpreter.
     * @param data Data set to be added.
     */
    public TerminalExpression(Set<String> data){
        this.set.addAll(data);
    }
    @Override
    public boolean interpret(String context){
        if(set.contains(context)) {
            return true;
        }
        else {
            return false;
        }
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }
}
