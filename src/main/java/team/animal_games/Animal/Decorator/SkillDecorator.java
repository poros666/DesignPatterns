package main.java.team.animal_games.Animal.Decorator;

/**
 * @author Raven
 */
public abstract class SkillDecorator extends Animal {
    protected Animal ani;
    public SkillDecorator(Animal ani){
        this.ani = ani;
    }

    public abstract double getCost();
}
