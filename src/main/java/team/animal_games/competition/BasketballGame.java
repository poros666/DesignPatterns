package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.BasketballGameRecorder;
import main.java.team.animal_games.score.ScoreRecorder;

public class BasketballGame extends Competition{

    //protected BasketballKit basketballKit;

    public BasketballGame(){
        //_basketballKit = new BasketballKit;
        System.out.println("BasketballGame::BasketballGame()::\" create a basketball game!\"");
    }

    @Override
    public int[] race() {
        System.out.println("BasketballGame::race()::");
        _competitionResult = new int[3];
        return new int[3];
    }

    @Override
    public int[] getScore(){
        return new BasketballGameRecorder().recordScore(this);
    }
}
