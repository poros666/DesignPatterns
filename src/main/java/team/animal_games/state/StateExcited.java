package main.java.team.animal_games.state;

import main.java.team.animal_games.competition.Competition;

public class StateExcited extends State{
    public StateExcited(){
        state="excited";
    }
    public void handleState(Competition competition){
        System.out.println("hello");
    }

}
