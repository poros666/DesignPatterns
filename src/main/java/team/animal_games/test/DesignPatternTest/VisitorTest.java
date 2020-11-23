package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.competition.BasketballGame;
import main.java.team.animal_games.competition.Competition;
import main.java.team.animal_games.score.BasketballGameRecorder;

public class VisitorTest {
    static public void visitorTest(){
        System.out.println("BasketBallGame::BasketBallGame::创建异常篮球比赛");
        Competition basketballGame=new BasketballGame();
        /*System.out.println("BasketBallGame::race()::进行比赛");
        basketballGame.race();*/
        System.out.println("BasketBallGame::BasketballGameRecorder()::创建一个篮球比赛结果访问者");
        BasketballGameRecorder recorder=new BasketballGameRecorder();
        System.out.println("BasketBallGame::recordScore(basketballGame)::将篮球比赛转换成积分");
        int[] score=recorder.recordScore(basketballGame);
        for(int i=0;i<score.length;i++){
            System.out.format("第%d队获得%d点积分 ",i,score[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("\n\n-----------------Visitor Test------------------\n\n");
        visitorTest();
    }
}
