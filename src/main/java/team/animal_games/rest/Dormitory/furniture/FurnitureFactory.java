package animal_games.rest.Dormitory.furniture;

import java.util.HashMap;

/**
 * @author dabao
 * @version 1.0
 * @description Furniture factory class
 * @date 2020/11/24 23:34
 */
public class FurnitureFactory {
    private HashMap<FurnitureKind, Furniture> furniturePool;         //Pool for storing furniture objects
    private static FurnitureFactory furnitureFactory = new FurnitureFactory();  //furniture factory

    /**
     * @className: FurnitureFactory
     * @description: create the new  FurnitureFactory
     * @param: []
     */
    public FurnitureFactory() {
        furniturePool = new HashMap<>();
    }

    /**
     * @methodName: getInstance
     * @description: get the instance of the factory
     * @param: []
     * @return: animal_games.rest.Dormitory.furniture.FurnitureFactory
     * @throws:
     */
    public static FurnitureFactory getInstance() {
        return furnitureFactory;
    }

    public Furniture getFurnitureByKind(FurnitureKind kind) {
        /**
         * @description: Return some kind of furniture from the furniture pool.
         *
         * @param kind : The kind of furniture to be returned.
         *
         * @return : animal_games.rest.dormitory.furniture.Furniture
         **/
        Furniture furniture = furniturePool.get(kind);
        if (furniture == null) {
            furniture = createFurniture(kind);
            furniturePool.put(kind, furniture);
        } else {
            System.out.println(kind.toString() + " object shared, reference count + 1 = " + (furniture.getReferenceCount() + 1));
        }
        return furniture.getReference();
    }

    public Furniture createFurniture(FurnitureKind kind) {
        /**
         * @description: Create the furniture instance according to the kind provided.
         *
         * @param kind : The kind of the furniture to be created.
         *
         * @return : animal_games.rest.dormitory.furniture.Furniture
         **/
        Furniture furniture = null;
        switch (kind) {
            case Bed:
                furniture = new Bed();
                break;
            case Desk:
                furniture = new Desk();
                break;
            case Chair:
                furniture = new Chair();
                break;
        }
        return furniture;
    }
}
