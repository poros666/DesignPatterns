package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.Animal.Strategy.DoFly;
import main.java.team.animal_games.Animal.Strategy.StrategyContext;

import java.util.*;

/**
 * @author Raven
 */
public class StrategyTest {
    public static void main(String[] args){
        Map player1 = new HashMap<String, Integer>(10)
        {
            {
                put("STR", (int) (Math.random()*10));
                put("INT", (int) (Math.random()*10));
                put("CON", (int) (Math.random()*10));
                put("AGI", (int) (Math.random()*10));
                put("MEN", (int) (Math.random()*10));
                put("VIT", (int) (Math.random()*10));
                put("LUK", (int) (Math.random()*10));
                put("WIS", (int) (Math.random()*10));
            }
        };
        Map player2 = new HashMap<String, Integer>(10)
        {
            {
                put("STR", (int) (Math.random()*10));
                put("INT", (int) (Math.random()*10));
                put("CON", (int) (Math.random()*10));
                put("AGI", (int) (Math.random()*10));
                put("MEN", (int) (Math.random()*10));
                put("VIT", (int) (Math.random()*10));
                put("LUK", (int) (Math.random()*10));
                put("WIS", (int) (Math.random()*10));
            }
        };
        StrategyContext fly = new StrategyContext(new DoFly());
        StrategyContext swim = new StrategyContext(new DoFly());
        StrategyContext run = new StrategyContext(new DoFly());
        double weight1 = 0;
        double weight2 = 0;

        System.out.println("\n\n-----------------Strategy Test------------------");
        System.out.println("\nTwo contestants are prepared ! It's show time !");
        System.out.println("\nStatistics of the two contestants are :");
        System.out.println("\nPlayer one :");
        Iterator iter1 = player1.entrySet().iterator();
        String key1;
        Integer value1;
        while(iter1.hasNext()){
            Map.Entry entry = (Map.Entry)iter1.next();
            key1 = (String)entry.getKey();
            value1 =(Integer)entry.getValue();
            System.out.println( key1 +" : "+value1);
        }
        System.out.println("\nPlayer two :");
        Iterator iter2 = player2.entrySet().iterator();
        String key2;
        Integer value2;
        while(iter2.hasNext()){
            Map.Entry entry = (Map.Entry)iter2.next();
            key2 = (String)entry.getKey();
            value2 =(Integer)entry.getValue();
            System.out.println( key2 +" : "+value2);
        }

        System.out.println("\nChoose the race !");

        Scanner input = new Scanner(System.in);
        int flag;

        boolean stopFlag = false;

        do{
            System.out.println("\n1.Swim 2.Run 3.Fly");

            try{
                flag = Integer.parseInt(input.nextLine());
            }catch (ArrayIndexOutOfBoundsException | InputMismatchException | NumberFormatException e){
                System.out.println("\nWrong input , please enter again");
                continue;
            }
            if(flag == 1){
                weight1 = swim.doStrategy(player1);
                weight2 = swim.doStrategy(player2);
                stopFlag = true;
            }
            else if(flag == 2){
                weight1 = run.doStrategy(player1);
                weight2 = run.doStrategy(player2);
                stopFlag = true;
            }

            else if(flag == 3){
                weight1 = fly.doStrategy(player1);
                weight2 = fly.doStrategy(player2);
                stopFlag = true;
            }
            else{
                System.out.println("\nWrong input , please enter again");
            }

        }while(!stopFlag);
        String winner;
        if(weight1 > weight2){
            winner = "Player one";
        }
        else if(weight1 < weight2){
            winner = "Player two";
        }
        else{
            winner = "It is a tie ! ";
        }

        System.out.println("\nThe winner of the game is ... ");
        System.out.println("\n" + winner + " ! ");
        System.out.println("\nTheir results : ");
        System.out.println("\nPlayer one : " + (int)weight1 + " Player two : " + (int)weight2);
    }
}
