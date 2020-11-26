package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Cattle extends Animal {
    public Cattle(){
        super();
    }
    public Cattle(String name){
        super(name);
    }
    public Cattle(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一头牛。";
    }
}
