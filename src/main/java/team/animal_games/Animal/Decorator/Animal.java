package main.java.team.animal_games.Animal.Decorator;

/**
 * @author Raven
 */
public class Animal {
    private double worth = 1;
    private String profile = "这是一只动物";
    double getWorth(){
        return this.worth;
    }
    String getDescription(){
        return this.profile;
    }
}
