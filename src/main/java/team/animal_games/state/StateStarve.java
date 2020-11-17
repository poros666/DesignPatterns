package main.java.team.animal_games.state;

import main.java.team.animal_games.competition.Competition;

public class StateStarve extends State{
    public StateStarve(){
        state="starve";
    }
    public void handleState(Competition competition){
        System.out.println("hello");
    }

}
