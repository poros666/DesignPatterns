package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.Animal.animals.Horse;
import main.java.team.animal_games.state.StateSick;

public class NullObjectTest {
    static public void nullObjectTest(){
        System.out.println("Animal::Animal(horse):创建一只没有状态的马(无需状态参数)");
        Horse horse=new Horse("horse");
        System.out.println("Animal::showState()::调用NullState::showState()::显示当前马的状态(无状态)");
        horse.showState();
        System.out.println("NullState::isNil():判断当前状态是否为空状态");
        System.out.println(horse.getState().isNil());

        System.out.println("Animal::setState(stateSick)::更改当前马的状态为生病状态");
        System.out.println("StateSick:StateSick()::创建一个生病状态");
        StateSick stateSick=new StateSick();
        horse.setState(stateSick);
        System.out.println("Animal::showState()::调用StateSick::showState()::显示当前马的状态(生病)");
        horse.showState();
        System.out.println("StateSick::isNil():判断当前状态是否为空状态");
        System.out.println(horse.getState().isNil());
    }
    public static void main(String[] args){
        System.out.println("\n\n-----------------Null Object Test------------------\n\n");
        nullObjectTest();
    }
}
