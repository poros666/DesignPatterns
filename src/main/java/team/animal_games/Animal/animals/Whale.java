package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Whale extends Animal {
    public Whale(){
        super();
    }
    public Whale(String name){
        super(name);
    }
    public Whale(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一头鲸鱼。";
    }
}
