package main.java.team.animal_games.Animal.Decorator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Raven
 */
public class DecoratorTest {
    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println("\n\n-----------------Strategy Test------------------");
        System.out.println("\nAn animal athlete is approaching ! ");
        System.out.println("\nIt's a Horse !");

        System.out.println("\nChoose the skill to be added !");

        Scanner input = new Scanner(System.in);
        int flag = 0;
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;

        boolean stopFlag = false;

        do{
            System.out.println("\n1.不讲武德 2.偷袭 3.有备而来 4.结束");

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
            if(flag == 1&&flag1 == 0){
                animal = new NoWood(animal);
                System.out.println(animal.getDescription() + " and it is worth " + animal.getWorth());
                flag1 = 1;
                continue;
            }
            else if(flag == 2&&flag2 == 0){
                animal = new SneakAttack(animal);
                System.out.println(animal.getDescription() + " and it is worth " + animal.getWorth());
                flag2 = 1;
                continue;
            }

            else if(flag == 3&&flag3 == 0){
                animal = new WellPrepared(animal);
                System.out.println(animal.getDescription() + " and it is worth " + animal.getWorth());
                flag3 = 1;
                continue;
            }
            else if(flag == 4){
                stopFlag = true;
            }
            else{
                System.out.println("\nWrong input , please enter again");
                continue;
            }

        }while(!stopFlag);

    }
}
