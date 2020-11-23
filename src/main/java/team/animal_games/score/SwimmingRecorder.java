//author: Lei chen
package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

import java.util.Arrays;
import java.util.Comparator;

public class SwimmingRecorder implements ScoreRecorder {
    public int[] recordScore(Competition competition) {
        int[] rank = competition.get_competitionResult();
        int[][] sort = new int[rank.length][2];
        for (int i = 0; i < rank.length; i++) {//sort[i][0]表示队伍，sort[i][1]表示该队伍排名
            sort[i][0] = i;
            sort[i][1] = rank[i];
        }
        Arrays.sort(sort, new Comparator<int[]>() {//重写按数组排序
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < sort.length; i++) {
            if (i == 0) {
                rank[sort[i][0]] = 7;
            } else if (i == 1) {
                rank[sort[i][0]] = 5;
            } else if (i == 2) {
                rank[sort[i][0]] = 3;
            } else {
                rank[sort[i][0]] = 0;
            }
        }
        return rank;
    }
}
