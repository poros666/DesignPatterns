package main.java.team.animal_games.rest.Dormitory.furniture;
/**
 * @description The class for dest
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:32
 */
public class Desk extends  Furniture {
    /**
     * @className: Desk
     * @description: create the Desk
     * @param: []
     */
    public Desk(){
        sharable = true;
        referenceCount = 0;
        System.out.println("New Desk object created");
    }
    /**
     * @methodName: move
     * @description: move the desk
     * @param: []
     * @return: void
     * @throws:
     */
    @Override
    public void move() {
        sharable = false;
        System.out.println("Desk is moved!");
    }

}