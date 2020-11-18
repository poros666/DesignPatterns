package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.RunningRecorder;
import main.java.team.animal_games.score.ScoreRecorder;


public class Running extends Competition{

    protected int _distance;

    public Running(){
        this.events="Running";
        if(Math.random()>0.5){
            _distance = 100;
        }else {
            _distance = 1000;
        }
        System.out.println("Running::Running()::\"create a "+_distance+" meters running game!\"");
    }


    @Override
    public int[] race() {
        System.out.println("Running::race()::");
        _competitionResult = new int[3];
        return new int[0];
    }

    @Override
    public int[] getScore(){
        return new RunningRecorder().recordScore(this);
    }
}
