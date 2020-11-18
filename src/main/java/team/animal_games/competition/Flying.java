package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.FlyingRecorder;
import main.java.team.animal_games.score.ScoreRecorder;


public class Flying extends Competition{

    protected int _distance;

    public Flying(){
        this.events="Flying";
        if(Math.random()>0.5){
            _distance = 100;
        }else {
            _distance = 1000;
        }
        System.out.println("Flying::Flying()::\"create a "+_distance+" meters flying game!\"");
    }

    @Override
    public int[] race() {
        System.out.println("Flying::race()::");
        _competitionResult = new int[3];
        return new int[0];
    }

    @Override
    public int[] getScore(){
        return new FlyingRecorder().recordScore(this);
    }
}
