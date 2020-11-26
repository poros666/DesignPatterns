package main.java.team.animal_games.Animal.Strategy;

import java.util.*;

/**
 * @author Raven
 */
public class StrategyTest {
    public static void main(String[] args){
        Map player1 = new HashMap<String, Integer>(10)
        {
            {
                put("STR", 8);
                put("INT", 2);
                put("CON", 4);
                put("AGI", 5);
                put("MEN", 8);
                put("VIT", 7);
                put("LUK", 8);
                put("WIS", 3);
            }
        };
        Map player2 = new HashMap<String, Integer>(10)
        {
            {
                put("STR", 2);
                put("INT", 6);
                put("CON", 8);
                put("AGI", 8);
                put("MEN", 8);
                put("VIT", 9);
                put("LUK", 8);
                put("WIS", 8);
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
        int flag = 0;

        boolean stop_flag = false;

        do{
            System.out.println("\n1.Swim 2.Run 3.Fly");

            try{
                flag = Integer.parseInt(input.nextLine());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("\nWrong input , please enter again");
                continue;
            }catch (InputMismatchException e2){
                System.out.println("\nWrong input , please enter again");
                continue;
            }catch (NumberFormatException e3)
            {
                System.out.println("\nWrong input , please enter again");
                continue;
            }
            if(flag == 1){
                weight1 = swim.doStrategy(player1);
                weight2 = swim.doStrategy(player2);
                stop_flag = true;
            }
            else if(flag == 2){
                weight1 = run.doStrategy(player1);
                weight2 = run.doStrategy(player2);
                stop_flag = true;
            }

            else if(flag == 3){
                weight1 = fly.doStrategy(player1);
                weight2 = fly.doStrategy(player2);
                stop_flag = true;
            }
            else{
                System.out.println("\nWrong input , please enter again");
                continue;
            }

        }while(!stop_flag);
        String winner;
        if(weight1 > weight2){
            winner = "Player one";
        }
        else{
            winner = "Player two";
        }

        System.out.println("\nThe winner of the game is ... ");
        System.out.println("\n" + winner + " ! ");
        System.out.println("\nTheir results : ");
        System.out.println("\nPlayer one : " + weight1 + " Player two : " + weight2);
    }
}
