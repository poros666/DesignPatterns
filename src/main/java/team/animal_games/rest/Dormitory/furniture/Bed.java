package main.java.team.animal_games.rest.Dormitory.furniture;

/**
 * @description The class for bed
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:31
 */
public class Bed extends  Furniture {
    /**
     * @className: Bed
     * @description: create the bed
     * @param: []
     */
    public Bed(){
        sharable = true;
        referenceCount = 0;
        System.out.println("New Bed object created");
    }
    /**
     * @methodName: move
     * @description: move the bed
     * @param: []
     * @return: void
     * @throws:
     */
    @Override
    public void move() {
        sharable = false;
        System.out.println("Bed is moved!");
    }
}