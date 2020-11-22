package main.java.team.animal_games.equipment;

public class GetEquipmentDemo {
    public static void main(String[] args) {
        User cat = new User("Cat");
        User lion = new User("Lion");

        cat.giveEquipment("Aircraft");
        lion.giveEquipment("Barbell");
    }
}
