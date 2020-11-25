package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

import java.util.Arrays;
import java.util.Comparator;

public class GameScoreRecorder implements ScoreRecorder{
    public int[] recordScore(Competition competition) {
        int[] rank = competition.get_competitionResult();//获取比赛排名
        int[] ans=new int[rank.length];//存放结果,避免冲突
        int[][] sort = new int[rank.length][2];//排序数组
        for (int i = 0; i < rank.length; i++) {//sort[i][0]表示队伍，sort[i][1]表示该队伍排名
            sort[i][0] = rank[i];
            sort[i][1] = i;
        }
        Arrays.sort(sort, new Comparator<int[]>() {//重写按数组排序
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < sort.length; i++) {
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
