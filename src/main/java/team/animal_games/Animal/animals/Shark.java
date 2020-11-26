package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Shark extends Animal {
    public Shark(){
        super();
    }
    public Shark(String name){
        super(name);
    }
    public Shark(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一鲨鱼。";
    }
}
