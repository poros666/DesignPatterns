package main.java.team.animal_games.Animal.animals;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.state.State;

public class Eagle extends Animal {
    public Eagle(){
        super();
    }
    public Eagle(String name){
        super(name);
    }
    public Eagle(State s,String name){
        super(s,name);
    }
    @Override
    public String toString() {
        return "这是一只鹰。";
    }
}
