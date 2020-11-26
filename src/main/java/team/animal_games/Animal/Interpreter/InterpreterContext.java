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

    private Set<String> swimAnimal = new HashSet<>();
    private Set<String> runAnimal = new HashSet<>();
    private Set<String> flyAnimal = new HashSet<>();


    Expression junior;
    Expression senior;
    Expression superior;
    Expression fly;
    Expression run;
    Expression swim;

    Expression inspect;

    public InterpreterContext(){

    }

    public void addJuniorUser(String user){
        juniorUser.add(user);
    }
    public void addSeniorUser(String user){
        seniorUser.add(user);
    }
    public void addSuperiorUser(String user){
        superiorUser.add(user);
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
    public boolean qualificationInspection(String animal, String act, String level){
        fly = new TerminalExpression(flyAnimal);
        swim = new TerminalExpression(swimAnimal);
        run = new TerminalExpression(runAnimal);

        junior = new TerminalExpression(juniorUser);
        senior = new TerminalExpression(seniorUser);
        superior = new TerminalExpression(superiorUser);

        inspect = new AndExpression(fly, junior);
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
