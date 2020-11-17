package main.java.team.animal_games.state;

import main.java.team.animal_games.competition.Competition;

public class StateNormal extends State{
    public StateNormal(){
        state="normal";
    }
    public void handleState(Competition competition){
        System.out.println("hello");
    }

}
