package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.Animal.Interpreter.InterpreterContext;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Raven
 */
public class InterpreterTest {
    public static void main(String[] args){
        InterpreterContext interpreterContext = new InterpreterContext();
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n-----------------Interpreter Test------------------");
        System.out.println("\n");

        int flag;
        boolean stopFlag = false;
        String stop = "stop";

        do{
            System.out.println("\n1.Enter fly animal 2.Enter swim animal 3.Enter run animal");
            System.out.println("\n4.Enter junior animal 5.Enter senior animal 6.Enter superior animal");
            System.out.println("\n7.Start testing");

            try{
                flag = Integer.parseInt(input.nextLine());
            }catch (ArrayIndexOutOfBoundsException | InputMismatchException | NumberFormatException e){
                System.out.println("\nWrong input , please enter again");
                continue;
            }
            if(flag == 1){
                System.out.println("Enter fly animal (Enter stop to stop)");
                while(true){
                    if(scanner.hasNext())
                    {
                        String s = scanner.next();
                        if(stop.equals(s)) {
                            break;
                        }
                        else
                        {
                            interpreterContext.addFlyAnimal(s);
                        }
                    }
                }
            }
            else if(flag == 2){
                System.out.println("Enter swim animal (Enter stop to stop)");
                while(true){
                    if(scanner.hasNext())
                    {
                        String s = scanner.next();
                        if(stop.equals(s)) {
                            break;
                        }
                        else
                        {
                            interpreterContext.addSwimAnimal(s);
                        }
                    }
                }
            }

            else if(flag == 3){
                System.out.println("Enter run animal (Enter stop to stop)");
                while(true){
                    if(scanner.hasNext())
                    {
                        String s = scanner.next();
                        if(stop.equals(s)) {
                            break;
                        }
                        else
                        {
                            interpreterContext.addRunAnimal(s);
                        }
                    }
                }
            }
            else if(flag == 4){
                System.out.println("Enter junior animal (Enter stop to stop)");
                while(true){
                    if(scanner.hasNext())
                    {
                        String s = scanner.next();
                        if(stop.equals(s)) {
                            break;
                        }
                        else
                        {
                            interpreterContext.addJuniorUser(s);
                        }
                    }
                }
            }
            else if(flag == 5){
                System.out.println("Enter senior animal (Enter stop to stop)");
                while(true){
                    if(scanner.hasNext())
                    {
                        String s = scanner.next();
                        if(stop.equals(s)) {
                            break;
                        }
                        else
                        {
                            interpreterContext.addSeniorUser(s);
                        }
                    }
                }
            }
            else if(flag == 6){
                System.out.println("Enter superior animal (Enter stop to stop)");
                while(true){
                    if(scanner.hasNext())
                    {
                        String s = scanner.next();
                        if(stop.equals(s)) {
                            break;
                        }
                        else
                        {
                            interpreterContext.addSuperiorUser(s);
                        }
                    }
                }
            }
            else if(flag == 7){
                stopFlag = true;
            }
            else{
                System.out.println("\nWrong input , please enter again");
            }

        }while(!stopFlag);

        while(true){
            String testSubject;
            String action;
            String level;
            String flag1;
            System.out.println("\nEnter anything to start test or q to quit");
            flag1 = scanner.next();
            if("q".equals(flag1)){
                break;
            }

            System.out.println("\nNow please enter query by order of animal , action , race level");
            scanner.useDelimiter("\n");
            String str = scanner.next();
            System.out.println(str);
            String[] tokens = str.split(" ");
            testSubject = tokens[0];
            action = tokens[1];
            level = tokens[2];

            if(interpreterContext.qualificationInspection(str)){
                System.out.println(testSubject + " can " + action + " and can participate " + level + " race ");
            }
            else{
                System.out.println(testSubject + " is not qualified to take part in the race");
            }
        }
    }
}
