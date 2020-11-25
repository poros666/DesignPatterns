package main.java.team.animal_games.rest.Food;

/**
 * @className: MeshedPotato
 * @package animal_games.rest.Food
 * @description: the subclass of food that can be instanced to be eaten by animals
 * @author: Dandelion
 * @date: 2020-11-19 18:44
 * @version: V1.0
 */
public class MeshedPotato extends Food {
    /**
     * @className: MeshedPotato
     * @description: give MeshedPotato the foodtype and energy and show that factory generate it
     * @param: []
     */
    public MeshedPotato() {
        this.foodType = FoodType.vegetarian;
        this.energy = 100;
    }

    /**
     * @methodName: showFood
     * @description: show that factory generate MeshedPotato
     * @param: []
     * @return: void
     * @throws:
     */
    @Override
    public void showFood() {
        System.out.println("factory generate the MeshedPotato");
    }

}
