package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

import java.util.LinkedList;
import java.util.List;


public class ScoreResult {
    private List<Competition> teamScore;//restore the rank after a competition
    private int[] result;//restore the points every team gets

    /*construct the ScoreResult*/
    public ScoreResult() {
        teamScore = new LinkedList<>();
        result = new int[3];
    }

    /*add the competition*/
    public void add(Competition competition) {
        this.teamScore.add(competition);
    }

    /*remove the competition*/
    public void remove(Competition competition) {
        this.teamScore.remove(competition);
    }

    /*accept the competition and count the sum points per day*/
    public int[] accept(ScoreRecorder scoreRecorder) {
        for(Competition comp:teamScore){
            int[] score=comp.getScore(scoreRecorder);
            for(int i=0;i<3;i++){
                result[i]+=score[i];
            }
        }
        return result;
    }
}