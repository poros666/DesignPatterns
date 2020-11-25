package main.java.team.animal_games.rest.Dormitory.furniture;

/**
 * @author dabao
 * @version 1.0
 * @description The abstract class for furniture
 * @date 2020/11/24 23:33
 */
abstract public class Furniture {
    protected boolean sharable;          //Whether the mark can be shared
    protected int referenceCount;       //Record the number of times referenced

    public abstract void move();   //Virtual function of furniture class moving

    public boolean isSharable() {
        return sharable;
    }  //Return share flag

    public int getReferenceCount() {
        return referenceCount;
    }  //Return reference counting

    public void minusReferenceCount() { //The shared object has a reference count minus 1 when the copy is generated.
        if (--referenceCount == 0) {
            System.out.println("\nThis furniture object has been released!\n");
        }
    }

    /**
     * @return animal_games.rest.Dormitory.furniture.Furniture
     * @description To use the ReferenceCounting DS
     * @params []
     * @author dabao
     * @date 2020/11/24 23:33
     */
    public Furniture getReference() {  //Return to furniture reference
        referenceCount++;
        return this;
    }
}
