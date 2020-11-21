package main.java.team.animal_games.Animal.Decorator;

/**
 * @author Raven
 */
public class WellPrepared extends SkillDecorator{
    public WellPrepared(Animal ani) {
        super(ani);
    }
    @Override
    public double getCost(){
        return ani.getWorth() + 69;
    }
    @Override
    public String getDescription(){
        return ani.getDescription() + " 看来是有备而来 ";
    }
}
