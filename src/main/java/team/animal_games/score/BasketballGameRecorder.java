package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

import java.util.HashMap;

public class BasketballGameRecorder implements ScoreRecorder{
    public int[] recordScore(Competition competition){
       int[] rank=competition.race();
       HashMap<Integer,Integer> score=new HashMap<>();
       return rank;
    }
}
