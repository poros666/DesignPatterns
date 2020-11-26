package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Lion extends Animal {
    public Lion(){
        super();
    }
    public Lion(String name){
        super(name);
    }
    public Lion(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一头狮子。";
    }
}
