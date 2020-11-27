package main.java.team.animal_games.equipment.shoe;

public abstract class Shoe implements Cloneable {

    private String id;
    protected String type;
    protected int value;

    abstract void draw();
    /**
     * @description: output
     *
     **/

    public String getType(){
        return type;
    }
    /**
     * @description: return type
     *
     **/

    public int getValue(){
        return value;
    }
    /**
     * @description: return value
     *
     **/

    public String getId() {
        return id;
    }
    /**
     * @description: return id
     *
     **/

    public void setId(String id) {
        this.id = id;
    }
    /**
     * @description: set id
     *
     **/

    public Object clone() {
        /**
         * @description: clone this object
         *
         **/
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}