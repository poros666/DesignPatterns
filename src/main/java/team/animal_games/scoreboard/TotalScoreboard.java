package main.java.team.animal_games.scoreboard;

//Scoreboard that take all the scores in
public class TotalScoreboard extends Scoreboard {

    //refresh the scoreboard
    @Override
    public void response(int day, int[] scores) {
        for (int i = 0; i < 3; i++) {
            scoreboard[i] += scores[i];
        }
    }
}
