package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.state.Animal;
import main.java.team.animal_games.state.StateExcited;
import main.java.team.animal_games.state.StateSick;

public class StateTest {
    static public void stateTest(){
        System.out.println("StateExcited:StateExcited()::创建一个兴奋状态");
        StateExcited stateExcited=new StateExcited();
        System.out.println("Animal::Animal(dog,stateExcited)::创建一只兴奋状态状态的狗");
        Animal dog=new Animal("dog",stateExcited);
        System.out.println("Animal::showState()::调用StateExcited::showState()::显示当前狗的状态(兴奋)");
        dog.showState();
        System.out.println("StateSick:StateSick()::创建一个生病状态");
        StateSick stateSick=new StateSick();
        System.out.println("Animal::setState(stateSick)::更改当前狗的状态为生病状态");
        dog.setState(stateSick);
        System.out.println("Animal::showState()::调用StateSick::showState()::显示当前狗的状态(生病)");
        dog.showState();
    }
    public static void main(String[] args){
        System.out.println("\n\n-----------------State Test------------------\n\n");
        stateTest();
    }
}
