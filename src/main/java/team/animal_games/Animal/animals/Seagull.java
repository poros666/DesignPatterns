package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Seagull extends Animal {
    public Seagull(){
        super();
    }
    public Seagull(String name){
        super(name);
    }
    public Seagull(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一只海鸥。";
    }
}
