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
    public static void main(String[] args) {
        AeroCache.loadCache();

        Aircraft aero1 = (Aircraft) AeroCache.getId("1");
        System.out.println("Aircraft : " + aero1.getType()+", value : "+aero1.getValue());
        Aircraft aero2 = (Aircraft) AeroCache.getId("2");
        System.out.println("Aircraft : " + aero2.getType()+", value : "+aero2.getValue());
        Aircraft aero3 = (Aircraft) AeroCache.getId("3");
        System.out.println("Aircraft : " + aero3.getType()+", value : "+aero3.getValue());

        BarbellCache.loadCache();
        Barbell barbell1 = (Barbell) BarbellCache.getId("1");
        System.out.println("Barbell : " + barbell1.getType());
        Barbell barbell2 = (Barbell) BarbellCache.getId("2");
        System.out.println("Barbell : " + barbell2.getType());

        BasketballCache.loadCache();
        Basketball basketball1 = (Basketball) BasketballCache.getId("1");
        System.out.println("Basketball : " + basketball1.getType());
        Basketball basketball2 = (Basketball) BasketballCache.getId("2");
        System.out.println("Basketball : " + basketball2.getType());

        ClothesCache.loadCache();
        Clothes clothes1 = ClothesCache.getId("1");
        System.out.println("Clothes : " + clothes1.getType());
        Clothes clothes2 = ClothesCache.getId("2");
        System.out.println("Clothes : " + clothes2.getType());

        HelmetCache.loadCache();
        Helmet helmet1 =HelmetCache.getId("1");
        System.out.println("Helmet : " + helmet1.getType());
        Helmet helmet2 = HelmetCache.getId("2");
        System.out.println("Helmet : " + helmet2.getType());

        ShoeCache.loadCache();
        Shoe shoe1 = (Shoe) ShoeCache.getId("1");
        System.out.println("Shoe : " + shoe1.getType());
        Shoe shoe2 = (Shoe) ShoeCache.getId("2");
        System.out.println("Shoe : " + shoe2.getType());

    }
}
