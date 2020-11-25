package main.java.team.animal_games.scoreboard;

import java.util.Arrays;

//an abstract class of all the scoreboards
public abstract class Scoreboard {

    //container to store all the score of the three teams
    protected int[] scoreboard;

    public Scoreboard(){
        scoreboard=new int[3];
    }
    //show the rank
    public void show() {
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ":" + scoreboard[i]);
        }
    }

    //a function notify all the scoreboards
    public abstract void response(int day, int[] scores);

}
