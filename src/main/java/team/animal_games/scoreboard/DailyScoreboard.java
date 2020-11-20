package main.java.team.animal_games.scoreboard;

public class DailyScoreboard extends Scoreboard {
    private int day;

    public DailyScoreboard(int day) {
        this.day = day;
    }

    @Override
    public void response(int day, int[] scores) {
        if (day == this.day) {
            for (int i = 0; i < 3; i++) {
                scoreboard[i] += scores[i];
            }
        }
    }
}
