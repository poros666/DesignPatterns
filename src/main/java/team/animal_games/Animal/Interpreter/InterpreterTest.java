package main.java.team.animal_games.Animal.Interpreter;

/**
 * @author Raven
 */
public class InterpreterTest {
    public static void main(String[] args){
        InterpreterContext interpreterContext = new InterpreterContext();
        interpreterContext.addFlyAnimal("tiger");
        String testSubject = "tiger";
        String action = "fly";

        if(interpreterContext.actionInspection(testSubject, action)){
            System.out.println(testSubject + " can " + action);
        }
        else{
            System.out.println(testSubject + " can not " + action);
        }
    }
}
