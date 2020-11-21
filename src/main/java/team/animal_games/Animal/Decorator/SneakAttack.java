package main.java.team.animal_games.Animal.Decorator;

/**
 * @author Raven
 */
public class SneakAttack extends SkillDecorator{
    public SneakAttack(Animal ani) {
        super(ani);
    }
    @Override
    public double getCost(){
        return ani.getWorth() + 69;
    }
    @Override
    public String getDescription(){
        return ani.getDescription() + " 来偷袭 ";
    }
}
