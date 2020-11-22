package main.java.team.animal_games.Animal.Adapter;

import main.java.team.animal_games.Animal.Animal;

public class Tiger /*extends Animal*/ {
    public void move(){
        System.out.println("现在这只老虎只能走。");
    }
    public void eat(){
        System.out.println("现在这只老虎只能吃老虎的食物");
    }
    public void sleep(){
        System.out.println("现在这只老虎只能睡老虎的宿舍。");
    }
}
