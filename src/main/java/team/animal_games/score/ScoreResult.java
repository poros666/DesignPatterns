package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

import java.util.LinkedList;
import java.util.List;


public class ScoreResult {
    private List<Competition> teamScore;//存放比赛
    private int[] result;//存放各队伍得分总和

    public ScoreResult() {
        teamScore = new LinkedList<>();
        result = new int[3];
    }

    public void add(Competition competition) {
        this.teamScore.add(competition);
    }//添加比赛

    public void remove(Competition competition) {
        this.teamScore.remove(competition);
    }//移除比赛

    public int[] accept(ScoreRecorder scoreRecorder) {//对所有比赛统计各队伍获得积分
        for(Competition comp:teamScore){
            int[] score=comp.getScore(scoreRecorder);
            for(int i=0;i<3;i++){
                result[i]+=score[i];
            }
        }
        return result;
    }
}