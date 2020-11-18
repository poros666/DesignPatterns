package main.java.team.animal_games.scoreboard;

import java.util.Arrays;

public abstract class Scoreboard {
    private int[] scores;
    public void show (){
        for(int i=0;i<3;i++)
        {
            System.out.println();
        }
    }
    public abstract void response(int day,int[]scores);



}
