package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

import java.util.ArrayList;

public class ScoreBoard {
    private ArrayList<Competition> CompetitionList=new ArrayList<Competition>();
    public void add(Competition competition)
    {
        CompetitionList.add(competition);
    }

    public void accept(ScoreRecorder scoreRecorder){
    }
}
