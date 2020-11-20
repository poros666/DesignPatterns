package main.java.team.animal_games.scoreboard;

public class TotalScoreboard extends Scoreboard {
    @Override
    public void response(int day, int[] scores) {
        for (int i = 0; i < 3; i++) {
            scoreboard[i] += scores[i];
        }
    }
}
