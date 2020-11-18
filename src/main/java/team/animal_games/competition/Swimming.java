package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.ScoreRecorder;

public class Swimming extends Competition{

    protected int _distance;

    public Swimming(){
        if(Math.random()>0.5){
            _distance = 100;
        }else {
            _distance = 1000;
        }
        System.out.println("Swimming::Swimming()::\"create a "+_distance+" meters swimming game!\"");
    }

    @Override
    public int[] race() {
        System.out.println("Swimming::race()::");
        _competitionResult = new int[3];
        return new int[0];
    }
    public int[] countScore(ScoreRecorder scoreRecorder){
        return scoreRecorder.recordScore(this);
    }
}
