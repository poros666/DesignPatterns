package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

import java.util.Arrays;
import java.util.Comparator;

public class GameScoreRecorder implements ScoreRecorder{
    /*
        count the points every team get and sort by the team
     */
    public int[] recordScore(Competition competition) {
        int[] rank = competition.get_competitionResult();//get the rank after the competition
        int[] ans=new int[rank.length];//restore the rank
        int[][] sort = new int[rank.length][2];//sort the rank with team
        for (int i = 0; i < rank.length; i++) {//sort[i][0]stands for team，sort[i][1]stands for rank
            sort[i][0] = rank[i];
            sort[i][1] = i;
        }
        Arrays.sort(sort, new Comparator<int[]>() {//override the sort
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < sort.length; i++) {//count the points every team get
            if (i == 0) {
                ans[sort[i][0]] = 5;
            } else if (i == 1) {
                ans[sort[i][0]] = 3;
            } else if (i == 2) {
                ans[sort[i][0]] = 2;
            } else {
                ans[sort[i][0]] = 0;
            }
        }
        return ans;
    }
}
