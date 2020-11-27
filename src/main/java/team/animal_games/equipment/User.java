package main.java.team.animal_games.equipment;

public class User {
    private String name;

    public String getName() {
        return name;
    }
    /**
     * @description: return user's name
     *
     **/
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @description: set user's name
     *
     **/
    public User(String name){
        this.name  = name;
    }
    /**
     * @description: initial user
     *
     **/
    public void giveEquipment(String message){
        GetEquipment.showEquipment(this,message);
    }
    /**
     * @description: encloses the acts between user and equipment and qualities.
     *
     **/
}
