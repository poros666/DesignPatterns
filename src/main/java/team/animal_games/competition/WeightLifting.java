package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.ScoreRecorder;
import main.java.team.animal_games.score.WeightLiftingRecorder;

public class WeightLifting extends Competition{

    //protected Barbell _barbells;

    public WeightLifting(){
        //_barbells = new Barbells;
        System.out.println("WeightLifting::WeightLifting()::\" create a weightlifting game!\"");
    }

    public void setBarbells(){
        System.out.println("WeightLifting::setBarbells()::\"set barbells to XXX KG\"");
    }

    @Override
    public int[] race() {
        System.out.println("WeightLifting::race()::");
        int[] power = animalPower();
        //tianqi + power =
        int[] ans = getRank(power);
        _competitionResult = ans;
        return ans;
    }

    @Override
    public int[] getScore(){
        return new WeightLiftingRecorder().recordScore(this);
    }
}
