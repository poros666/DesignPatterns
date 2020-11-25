package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.equipment.EquipmentFactory;
import main.java.team.animal_games.equipment.GetEquipment;
import main.java.team.animal_games.equipment.User;


public class MediatorTest {
    private static void testMediator()
    {
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
    private static final String kind[] = {  "aircraft","barbell", "basketball", "clothes", "helmet", "shoe" };

    public static void main(String[] args) {
        System.out.println("—————————————----------------------------------------———— Test[Mediator]Pattern —————————————----------------------------------------————");
        System.out.println("EquipmentDistributor : User : Users looking for equipments .");
        System.out.println("EquipmentDistributor : GetEquipment : An object that encapsulates how a set of objects interact,which combined the quality with equipments.");
        System.out.println("EquipmentDistributor : GetEquipment : Also offer users complete equipments ,allows their interaction to vary independently.");

        System.out.println("—————————————-----------------------------------------------------—————————————————------—-------------------------------------------————");
        testMediator();
        System.out.println("—————————————----------------------------------------------------- End ————————————------—-------------------------------------------————");
    }
}
