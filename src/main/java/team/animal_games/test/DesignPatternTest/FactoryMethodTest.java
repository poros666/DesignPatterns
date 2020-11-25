package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.rest.Dormitory.*;
import main.java.team.animal_games.rest.Food.*;

import java.util.Scanner;


public class FactoryMethodTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Factory Method]Pattern —————————————-------------------------------------————");
        System.out.println("MealiePizzaFactory:createFood():具体工厂MealiePizzaFactory的createFood函数，用于创造具体工厂对应的具体食物MealiePizza");
        System.out.println("MeshedPotatoFactory:createFood():具体工厂MeshedPotatoFactory的createFood函数，用于创造具体工厂对应的具体食物MeshedPotato");
        System.out.println("RoastMeatFactory:createFood():具体工厂RoastMeatFactory的createFood函数，用于创造具体工厂对应的具体食物RoastMeat");
        System.out.println("MealiePizza:MealiePizza():MealiePizza的构造函数，设置食物初始值，说明工厂产品MealiePizza已经被创建");
        System.out.println("MeshedPotato:MeshedPotato():MeshedPotato的构造函数，设置食物初始值,说明工厂产品MeshedPotato已经被创建");
        System.out.println("RoastMeat:RoastMeat():RoastMeat的构造函数，设置食物初始值，说明工厂产品RoastMeat已经被创建");
        System.out.println("");
        while(true){
            try {
                System.out.println("输入要创建的食物类型：1.MealiePizza，2.MeshedPotato,3.RoastMeat,输入其他数字则退出:");
                Scanner sc = new Scanner(System.in);
                int number=sc.nextInt();
                if(number==1){
                    Food food=new MealiePizzaFactory().createFood();
                    food.showFood();
                }
                else if(number==2){
                    Food food=new MeshedPotatoFactory().createFood();
                    food.showFood();
                }
                else if(number==3){
                    Food food=new RoastMeatFactory().createFood();
                    food.showFood();
                }
                else {
                    break;
                }
            }catch (Exception e){
                System.out.println("输入数字无效，重新输入");
            }
        }




        System.out.println("");
        System.out.println("—————————————-------------------------------------————————————————  End —————————————————————————-------------------------------------————");
    }
}
