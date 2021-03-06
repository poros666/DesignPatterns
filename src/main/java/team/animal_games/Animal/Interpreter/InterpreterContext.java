package main.java.team.animal_games.Animal.Interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Raven
 * @Description context for this method.
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

    public void addSwimAnimal(String animal){ swimAnimal.add(animal); }
    public void addRunAnimal(String animal){
        runAnimal.add(animal);
    }
    public void addFlyAnimal(String animal){
        flyAnimal.add(animal);
    }

    /**
     * Main function to inspect qualification of the animal.
     * @param str
     * @return qualification true or false.
     */
    public boolean qualificationInspection(String str){
        String[] tokens = str.split(" ");
        String animal = tokens[0];
        String act = tokens[1];
        String level = tokens[2];
        fly = new TerminalExpression(flyAnimal);
        swim = new TerminalExpression(swimAnimal);
        run = new TerminalExpression(runAnimal);

        junior = new TerminalExpression(juniorUser);
        senior = new TerminalExpression(seniorUser);
        superior = new TerminalExpression(superiorUser);

        if("fly".equals(act)&&"junior".equals(level)){
            inspect = new AndExpression(fly, junior);
            return inspect.interpret(animal);
        }
        else if("swim".equals(act)&&"junior".equals(level)){
            inspect = new AndExpression(swim, junior);
            return inspect.interpret(animal);
        }
        else if("run".equals(act)&&"junior".equals(level)){
            inspect = new AndExpression(run, junior);
            return inspect.interpret(animal);
        }
        else if("fly".equals(act)&&"senior".equals(level)){
            inspect = new AndExpression(fly, senior);
            return inspect.interpret(animal);
        }
        else if("swim".equals(act)&&"senior".equals(level)){
            inspect = new AndExpression(swim, senior);
            return inspect.interpret(animal);
        }
        else if("run".equals(act)&&"senior".equals(level)){
            inspect = new AndExpression(run, senior);
            return inspect.interpret(animal);
        }
        else if("fly".equals(act)&&"superior".equals(level)){
            inspect = new AndExpression(fly, superior);
            return inspect.interpret(animal);
        }
        else if("swim".equals(act)&&"superior".equals(level)){
            inspect = new AndExpression(swim, superior);
            return inspect.interpret(animal);
        }
        else if("run".equals(act)&&"superior".equals(level)){
            inspect = new AndExpression(run, superior);
            return inspect.interpret(animal);
        }
        else{
            return false;
        }
    }

}
