package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

import java.util.LinkedList;
import java.util.List;


public class ScoreResult {
    private List<Competition> teamScore;
    private int[] result;

    public ScoreResult() {
        teamScore = new LinkedList<>();
        result = new int[3];
    }

    public void add(Competition competition) {
        teamScore.add(competition);
    }

    public void remove(Competition competition) {
        teamScore.remove(competition);
    }

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