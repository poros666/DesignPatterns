package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Horse extends Animal {
    public Horse(){
        super();
    }
    public Horse(String name){
        super(name);
    }
    public Horse(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一匹马。";
    }
}
