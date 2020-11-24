package main.java.team.animal_games.equipment;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void giveEquipment(String message){
        GetEquipment.showEquipment(this,message);
    }
}
