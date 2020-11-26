package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.state.Animal;
import main.java.team.animal_games.state.StateSick;

public class NullObjectPatternTest {
    static public void nullObjectPatternTest(){
        System.out.println("Animal::Animal(dog):创建一只没有状态的狗(无需状态参数)");
        Animal dog=new Animal("dog");
        System.out.println("Animal::showState()::调用NullState::showState()::显示当前狗的状态(无状态)");
        dog.showState();
        System.out.println("NullState::isNil():判断当前状态是否为空状态");
        System.out.println(dog.getState().isNil());

        System.out.println("Animal::setState(stateSick)::更改当前狗的状态为生病状态");
        System.out.println("StateSick:StateSick()::创建一个生病状态");
        StateSick stateSick=new StateSick();
        dog.setState(stateSick);
        System.out.println("Animal::showState()::调用StateSick::showState()::显示当前狗的状态(生病)");
        dog.showState();
        System.out.println("StateSick::isNil():判断当前状态是否为空状态");
        System.out.println(dog.getState().isNil());
    }
    public static void main(String[] args){
        System.out.println("\n\n-----------------Null Object Test------------------\n\n");
        nullObjectPatternTest();
    }
}
