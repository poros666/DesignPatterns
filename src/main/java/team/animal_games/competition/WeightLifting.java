package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.ScoreRecorder;
import main.java.team.animal_games.score.WeightLiftingRecorder;

public class WeightLifting extends Competition{

    //protected Barbell _barbells;

    public WeightLifting(){
        this.events="WeightLifting";
        //_barbells = new Barbells;
        System.out.println("WeightLifting::WeightLifting()::\" create a weightlifting game!\"");
    }

    public void setBarbells(){
        System.out.println("WeightLifting::setBarbells()::\"set barbells to XXX KG\"");
    }

    @Override
    public int[] race() {
        System.out.println("WeightLifting::race()::");
        _competitionResult = new int[3];
        return new int[0];
    }

    @Override
    public int[] getScore(){
        return new WeightLiftingRecorder().recordScore(this);
    }
}
