package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.competition.Competition;
import main.java.team.animal_games.competition.Flying;
import main.java.team.animal_games.competition.Running;
import main.java.team.animal_games.state.Animal;
import main.java.team.animal_games.state.NullState;
import main.java.team.animal_games.state.StateExcited;
import main.java.team.animal_games.state.StateSick;

public class TemplateMethodTest {
    public static void main(String[] args) {
        System.out.println("==============================TemplateMethodTest==============================");
        System.out.println("=====================now using a Flying Competition and a Running Competition as examples");
        Competition mycF = new Flying();
        Competition mycR = new Running();
        Animal[][] contF = new Animal[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String name = "animal";
                name = name.concat(String.valueOf(i));
                name = name.concat(String.valueOf(j));
                if (Math.random() < 0.3) {
                    contF[i][j] = new Animal(name, new StateExcited());
                } else if (Math.random() < 0.6) {
                    contF[i][j] = new Animal(name, new NullState());
                } else {
                    contF[i][j] = new Animal(name, new StateSick());
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
                    contR[i][j] = new Animal(name, new StateExcited());
                } else if (Math.random() < 0.6) {
                    contR[i][j] = new Animal(name, new NullState());
                } else {
                    contR[i][j] = new Animal(name, new StateSick());
                }
            }
        }
        mycF.set_contestant(contF);
        mycR.set_contestant(contR);
        System.out.println("==================Different subclasses of Competition==================");
        System.out.println("==================will call the same startCompetition() !==================");
        System.out.println("==================will call the specific race() !==================");
        System.out.println("==================will call the same prizeGiving() !==================");
        System.out.println("==================Rerun may help find difference!==================");
        System.out.println("====================================Flying:==================");
        mycF.runCompetition();
        System.out.println("====================================Running:==================");
        mycR.runCompetition();
        System.out.println("==================Rerun may help find difference!==================");

//        上面是整体连续测试，如果看不懂，可以试试下面的分步测试，可能会看的清楚一点。
//        System.out.println("==================Different subclasses of Competition==================");
//        System.out.println("==================will call the same startCompetition() !==================");
//        System.out.println("Flying:");
//        mycF.startCompetition();
//        System.out.println("Running:");
//        mycR.startCompetition();
//        System.out.println("==================will call the specific race() !==================");
//        System.out.println("Flying:");
//        mycF.race();
//        System.out.println("Running:");
//        mycR.race();
//        System.out.println("==================will call the same prizeGiving() !==================");
//        System.out.println("Flying:");
//        mycF.prizeGiving();
//        System.out.println("Running:");
//        mycR.prizeGiving();
//        System.out.println("==================Rerun may help find difference!==================");

    }
}
