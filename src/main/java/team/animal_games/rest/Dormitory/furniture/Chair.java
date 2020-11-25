package animal_games.rest.Dormitory.furniture;

/**
 * @description The class for chair
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:31
 */
public class Chair extends  animal_games.rest.Dormitory.furniture.Furniture {
    /**
     * @className: Chair
     * @description: create the Chair
     * @param: []
     */
    public Chair(){
        sharable = true;
        referenceCount = 0;
        System.out.println("New Chair object created");
    }

    @Override
    /**
     * @description move the chair
     * @params []
     * @author dabao
     * @date 2020/11/24 23:31
     * @return void
     */
    public void move() {
        sharable = false;
        System.out.println("Chair is moved!");
    }
}
