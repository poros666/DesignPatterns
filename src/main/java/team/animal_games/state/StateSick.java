package main.java.team.animal_games.state;

import main.java.team.animal_games.competition.Competition;

public class StateSick extends State{
    public StateSick(){
        state="sick";
    }
    public void handleState(Competition competition){
        System.out.println("hello");
    }

}
