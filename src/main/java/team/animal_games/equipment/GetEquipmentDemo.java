package main.java.team.animal_games.equipment;

public class GetEquipmentDemo {
    private static final String kind[] =
        {  "aircraft","barbell", "basketball", "clothes", "helmet", "shoe" };
    public static void main(String[] args) {
        User cat = new User("Cat");
        User lion = new User("Lion");
        int n = (int) (Math.random() * 100 % 6) ;

        GetEquipment equipments=new GetEquipment();
        equipments.getEquipment(kind[n]);
        cat.giveEquipment(equipments.getKind());
        n = (int) (Math.random() * 100 % 6) ;
        equipments.getEquipment(kind[n]);
        lion.giveEquipment(equipments.getKind());
    }
}
