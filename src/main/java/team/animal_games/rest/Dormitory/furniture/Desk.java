package animal_games.rest.Dormitory.furniture;
/**
 * @description The class for dest
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:32
 */
public class Desk extends  animal_games.rest.Dormitory.furniture.Furniture {

    public Desk(){
        sharable = true;
        referenceCount = 0;
        System.out.println("New Desk object created");
    }

    @Override
    public void move() {
        sharable = false;
        System.out.println("Desk is moved!");
    }

}