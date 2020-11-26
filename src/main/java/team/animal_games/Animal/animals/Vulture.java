package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Vulture extends Animal {
    public Vulture(){
        super();
    }
    public Vulture(String name){
        super(name);
    }
    public Vulture(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一只秃鹫。";
    }
}
