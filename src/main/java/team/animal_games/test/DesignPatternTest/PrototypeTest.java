package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.equipment.aircraft.AeroCache;
import main.java.team.animal_games.equipment.aircraft.Aircraft;
import main.java.team.animal_games.equipment.barbell.Barbell;
import main.java.team.animal_games.equipment.barbell.BarbellCache;
import main.java.team.animal_games.equipment.basketball.Basketball;
import main.java.team.animal_games.equipment.basketball.BasketballCache;
import main.java.team.animal_games.equipment.clothes.Clothes;
import main.java.team.animal_games.equipment.clothes.ClothesCache;
import main.java.team.animal_games.equipment.helmet.Helmet;
import main.java.team.animal_games.equipment.helmet.HelmetCache;
import main.java.team.animal_games.equipment.shoe.Shoe;
import main.java.team.animal_games.equipment.shoe.ShoeCache;

public class PrototypeTest {
    private static void testAeroPrototype()
    {
        AeroCache.loadCache();

        Aircraft aero1 = (Aircraft) AeroCache.getId("1");
        System.out.println("Aircraft : " + aero1.getType()+", value : "+aero1.getValue());

        Aircraft aero2 = (Aircraft) AeroCache.getId("2");
        System.out.println("Aircraft : " + aero2.getType()+", value : "+aero2.getValue());

        Aircraft aero3 = (Aircraft) AeroCache.getId("3");
        System.out.println("Aircraft : " + aero3.getType()+", value : "+aero3.getValue());
    }
    private static void testPrototype()
    {
        BarbellCache.loadCache();
        Barbell barbell1 = BarbellCache.getId("1");
        System.out.println("Barbell : " + barbell1.getType()+", value : "+barbell1.getValue());
        Barbell barbell2 = BarbellCache.getId("2");
        System.out.println("Barbell : " + barbell2.getType()+", value : "+barbell2.getValue());

        BasketballCache.loadCache();
        Basketball basketball1 = BasketballCache.getId("1");
        System.out.println("Basketball : " + basketball1.getType()+", value : "+basketball1.getValue());
        Basketball basketball2 = BasketballCache.getId("2");
        System.out.println("Basketball : " + basketball2.getType()+", value : "+basketball2.getValue());

        ClothesCache.loadCache();
        Clothes clothes1 = ClothesCache.getId("1");
        System.out.println("Clothes : " + clothes1.getType()+", value : "+clothes1.getValue());
        Clothes clothes2 = ClothesCache.getId("2");
        System.out.println("Clothes : " + clothes2.getType()+", value : "+clothes2.getValue());

        HelmetCache.loadCache();
        Helmet helmet1 =HelmetCache.getId("1");
        System.out.println("Helmet : " + helmet1.getType()+", value : "+helmet1.getValue());
        Helmet helmet2 = HelmetCache.getId("2");
        System.out.println("Helmet : " + helmet2.getType()+", value : "+helmet2.getValue());

        ShoeCache.loadCache();
        Shoe shoe1 = (Shoe) ShoeCache.getId("1");
        System.out.println("Shoe : " + shoe1.getType()+", value : "+shoe1.getValue());
        Shoe shoe2 = (Shoe) ShoeCache.getId("2");
        System.out.println("Shoe : " + shoe2.getType()+", value : "+shoe2.getValue());
    }
    public static void main(String[] args) {
        System.out.println("—————————————----------------------------------------———— Test[Prototype]Pattern —————————————----------------------------------------————");
        System.out.println("Aircraft : Aircraft : Create a prototypical instance.");
        System.out.println("Aircraft : AeroCache : Offer ability to create new objects from the 'skeleton' of an existing object.");
        System.out.println("Aircraft : Wing Aeroplane Can_not_fly : New objects created by Cache boosting performance and keeping memory footprints to a minimum.");

        System.out.println("—————————————-----------------------------------------------------—————————————————------—-------------------------------------------————");
        testAeroPrototype();
        System.out.println("—————————————-----------------------------------------——--- Other Equipments -————————---—-------------------------------------------————");
        testPrototype();
        System.out.println("—————————————----------------------------------------------------- End ————————————------—-------------------------------------------————");
    }



}
