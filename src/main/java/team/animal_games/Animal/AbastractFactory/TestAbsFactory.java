package main.java.team.animal_games.Animal.AbastractFactory;

public class TestAbsFactory {
    public static void main(String[] arg){
        RacingFactory racingFactory= new RacingFactory();
        LiftingFactory liftingFactory = new LiftingFactory();
        System.out.println(liftingFactory.createLandAnimals(1).toString());

    }
}
