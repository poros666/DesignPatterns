package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.competition.Competition;
import main.java.team.animal_games.competition.Flying;
import main.java.team.animal_games.competition.Running;
import main.java.team.animal_games.score.GameScoreRecorder;
import main.java.team.animal_games.score.ScoreResult;
import main.java.team.animal_games.state.StateExcited;
import main.java.team.animal_games.state.StateSick;

public class VisitorTest {
    static public void visitorTest(){
        System.out.println("Competition::Competition():创建比赛类");
        Competition mycF = new Flying();
        Competition mycR = new Running();
        System.out.println("创建参赛队伍");
        Animal[][] contF = new Animal[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String name = "animal";
                name = name.concat(String.valueOf(i));
                name = name.concat(String.valueOf(j));
                if (Math.random() < 0.3) {
                    contF[i][j] = new Animal(new StateExcited(),name);
                } else if (Math.random() < 0.6) {
                    contF[i][j] = new Animal(name);
                } else {
                    contF[i][j] = new Animal(new StateSick(),name);
                }
            }
        }
        Animal[][] contR = new Animal[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String name = "animal";
                name = name.concat(String.valueOf(i));
                name = name.concat(String.valueOf(j));
                if (Math.random() < 0.3) {
                    contR[i][j] = new Animal(new StateExcited(),name);
                } else if (Math.random() < 0.6) {
                    contR[i][j] = new Animal(name);
                } else {
                    contR[i][j] = new Animal(new StateSick(),name);
                }
            }
        }
        System.out.println("Competition::set_contestant():为比赛设置参赛队伍");
        mycF.set_contestant(contF);
        mycR.set_contestant(contR);
        System.out.println("==================Different subclasses of Competition==================");
        System.out.println("==================will call the same startCompetition() !==================");
        System.out.println("Flying:");
        mycF.startCompetition();
        System.out.println("Running:");
        mycR.startCompetition();
        System.out.println("==================will call the specific race() !==================");
        System.out.println("Flying:");
        mycF.race();
        System.out.println("Running:");
        mycR.race();
        System.out.println("==================will call the same prizeGiving() !==================");
        System.out.println("Flying:");
        mycF.prizeGiving();
        System.out.println("Running:");
        mycR.prizeGiving();
        System.out.println("==================Rerun may help find difference!==================");
        System.out.println("ScoreResult::ScoreResult()::创建visitor模式元素容器");
        ScoreResult result=new ScoreResult();
        System.out.println("ScoreResult::add(Competitiom)::将比赛放入容器");
        result.add(mycF);
        result.add(mycR);
        System.out.println("ScoreResult::accept(ScoreRecorder)::遍历容器中所有比赛,得出各队当天总积分");
        int[] testArray=result.accept(new GameScoreRecorder());
        for(int i=0;i<testArray.length;i++){
            System.out.format("第%d队获得积分%d\n",i,testArray[i]);
        }
    }
    public static void main(String[] args){
        System.out.println("\n\n-----------------Visitor Test------------------\n\n");
        visitorTest();
    }
}
