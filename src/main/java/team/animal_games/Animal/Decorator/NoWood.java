package main.java.team.animal_games.Animal.Decorator;
import main.java.team.animal_games.Animal.Animal;
/**
 * @author Raven
 * @Description this class is decorator for skill No wood.
 */
public class NoWood extends SkillDecorator{
    public NoWood(Animal ani) {
        super(ani);
    }
    @Override
    public double getWorth(){
        return ani.getWorth() - 69;
    }
    @Override
    public String getDescription(){
        return ani.getDescription() + " 这个年轻动物不讲武德 ";
    }
}
