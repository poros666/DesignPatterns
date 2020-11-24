package main.java.team.animal_games.equipment.clothes;

public abstract class Clothes implements Cloneable {

    private String id;
    protected String type;
    protected int value;

    abstract void draw();

    public String getType(){
        return type;
    }

    public int getValue(){
        return value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}