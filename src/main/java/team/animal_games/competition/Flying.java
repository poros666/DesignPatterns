package main.java.team.animal_games.competition;

public class Flying extends Competition{

    protected int _distance;

    public Flying(){
        if(Math.random()>0.5){
            _distance = 100;
        }else {
            _distance = 1000;
        }
        System.out.println("Flying::Flying()::\"create a "+_distance+" meters flying game!\"");
    }

    @Override
    public int[] race() {
        System.out.println("Flying::race()::");
        _competitionResult = new int[3];
        return new int[0];
    }
}
