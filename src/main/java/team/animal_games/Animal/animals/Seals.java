package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Seals extends Animal {
    public Seals(){
        super();
    }
    public Seals(String name){
        super(name);
    }
    public Seals(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一头海豹。";
    }
}
