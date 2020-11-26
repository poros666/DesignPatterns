package main.java.team.animal_games.Animal.Decorator;
import main.java.team.animal_games.Animal.Animal;
/**
 * @author Raven
 */
public abstract class SkillDecorator extends Animal {
    protected Animal ani;
    public SkillDecorator(Animal ani){
        this.ani = ani;
    }

    @Override
    public abstract double getWorth();
}
