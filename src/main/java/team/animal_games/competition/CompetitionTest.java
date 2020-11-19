package main.java.team.animal_games.competition;

import main.java.team.animal_games.state.*;

public class CompetitionTest {
    public static void main(String[] args) {
        Competition myc = new Flying();
        Animal[][] cont = new Animal[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(Math.random()<0.3){
                    cont[i][j] = new Animal("animaltest1", new StateExcited());
                }else if (Math.random()<0.6){
                    cont[i][j] = new Animal("animaltest2",new NullState());
                }else {
                    cont[i][j] = new Animal("animaltest3", new StateSick());
                }
            }
        }
        myc.set_contestant(cont);
        myc.startCompetition();
        myc.race();
        myc.prizeGiving();

    }
}
