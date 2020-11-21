package main.java.team.animal_games.Animal.Interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Raven
 */
public class InterpreterContext {
    private Set<String> juniorUser = new HashSet<>();
    private Set<String> seniorUser = new HashSet<>();
    private Set<String> superiorUser = new HashSet<>();

    private Set<String> juniorUsage = new HashSet<>();
    private Set<String> seniorUsage = new HashSet<>();
    private Set<String> superiorUsage = new HashSet<>();

    private Set<String> swimAnimal = new HashSet<>();
    private Set<String> runAnimal = new HashSet<>();
    private Set<String> flyAnimal = new HashSet<>();


    Expression junior;
    Expression senior;
    Expression superior;
    Expression fly;
    Expression run;
    Expression swim;

    public InterpreterContext(){

    }

    public void addJuniorUser(String user){
        juniorUser.add(user);
        seniorUser.add(user);
        superiorUser.add(user);
    }
    public void addJuniorUsage(String usage){
        juniorUsage.add(usage);
        seniorUsage.add(usage);
        superiorUsage.add(usage);
    }
    public void addSeniorUser(String user){
        seniorUser.add(user);
        superiorUser.add(user);
    }
    public void addSeniorUsage(String usage){
        seniorUsage.add(usage);
        superiorUsage.add(usage);
    }
    public void addSuperiorUser(String user){
        superiorUser.add(user);
    }
    public void addSuperiorUsage(String usage){
        superiorUsage.add(usage);
    }
    public void addSwimAnimal(String animal){
        swimAnimal.add(animal);
    }
    public void addRunAnimal(String animal){
        runAnimal.add(animal);
    }
    public void addFlyAnimal(String animal){
        flyAnimal.add(animal);
    }

    public boolean usageInspection(String expr){
        TerminalExpression juUser = new TerminalExpression(juniorUser);
        TerminalExpression seUser = new TerminalExpression(seniorUser);
        TerminalExpression suUser = new TerminalExpression(superiorUser);
        TerminalExpression juUsage = new TerminalExpression(juniorUsage);
        TerminalExpression seUsage = new TerminalExpression(seniorUsage);
        TerminalExpression suUsage = new TerminalExpression(superiorUsage);
        junior = new AndExpression(juUser, juUsage);
        senior = new AndExpression(seUser, seUsage);
        superior = new AndExpression(suUser, suUsage);
        return junior.interpret(expr)||senior.interpret(expr)||superior.interpret(expr);

    }
    public boolean actionInspection(String animal, String act){
        fly = new TerminalExpression(flyAnimal);
        swim = new TerminalExpression(swimAnimal);
        run = new TerminalExpression(runAnimal);
        if("fly".equals(act)){
            return fly.interpret(animal);
        }
        else if("swim".equals(act)){
            return swim.interpret(animal);
        }
        else if("run".equals(act)){
            return run.interpret(animal);
        }
        else{
            return false;
        }
    }

}
