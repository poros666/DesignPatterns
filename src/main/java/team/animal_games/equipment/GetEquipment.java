package main.java.team.animal_games.equipment;

import main.java.team.animal_games.equipment.aircraft.*;
import main.java.team.animal_games.equipment.barbell.*;
import main.java.team.animal_games.equipment.basketball.*;
import main.java.team.animal_games.equipment.clothes.*;
import main.java.team.animal_games.equipment.helmet.*;
import main.java.team.animal_games.equipment.shoe.*;

public class GetEquipment {
    private static final String quality[] =
            {  "White","Green", "Blue", "Purple", "Golden" };
    private static String Kind="First you should get Equipment!";
    private static int Price=0;
    private static int Value=0;
    public static String getKind(){
        return Kind;
    }
    public static int getPrice(){
        return Price;
    }
    public static int getValue(){
        return Value;
    }
    public static void getEquipment(String name) {
        double ratio = Math.random();
        m_equipment equipment = (m_equipment) EquipmentFactory.getEquipment(getRandomColor(ratio));
        equipment.setPrice(getRandomPrice(ratio));
        equipment.setMult(getRandomMult(ratio));
        switch (name) {
            case "aircraft" ->{ AeroCache.loadCache();
            int n = (int) (Math.random() * 100 % 3) + 1;
            Aircraft aero = AeroCache.getId("1");
            switch (n) {
                case 1 -> aero = AeroCache.getId("1");
                case 2 -> aero = AeroCache.getId("2");
                case 3 -> aero = AeroCache.getId("3");
                default -> System.out.println("There is no aircraft like that!");
            }
            Kind=equipment.getQuality()+" "+aero.getType();
            Value=aero.getValue() * equipment.getMult();
            Price=aero.getValue() * equipment.getPrice();
            System.out.println("Aircraft : " + equipment.getQuality() + " " + aero.getType() + ", value : " + aero.getValue() * equipment.getMult() + ", Price : " + aero.getValue() * equipment.getPrice());
            }
            case "barbell" -> {
                BarbellCache.loadCache();
                int n = (int) (Math.random() * 100 % 2) + 1;
                Barbell barbell = BarbellCache.getId("1");
                switch (n) {
                    case 1 -> barbell = BarbellCache.getId("1");
                    case 2 -> barbell = BarbellCache.getId("2");
                    default -> System.out.println("There is no barbell like that!");
                }
                Kind=equipment.getQuality()+" "+barbell.getType();
                Value=barbell.getValue() * equipment.getMult();
                Price=barbell.getValue() * equipment.getPrice();
                System.out.println("Barbell : " + equipment.getQuality() + " " + barbell.getType() + ", value : " + barbell.getValue() * equipment.getMult() + ", Price : " + barbell.getValue() * equipment.getPrice());
            }
            case "basketball" -> {
                BasketballCache.loadCache();
                int n = (int) (Math.random() * 100 % 2) + 1;
                Basketball basketball = BasketballCache.getId("1");
                switch (n) {
                    case 1 -> basketball = BasketballCache.getId("1");
                    case 2 -> basketball = BasketballCache.getId("2");
                    default -> System.out.println("There is no basketball like that!");
                }
                Kind=equipment.getQuality()+" "+basketball.getType();
                Value=basketball.getValue() * equipment.getMult();
                Price=basketball.getValue() * equipment.getPrice();
                System.out.println("Basketball : " + equipment.getQuality() + " " + basketball.getType() + ", value : " + basketball.getValue() * equipment.getMult() + ", Price : " + basketball.getValue() * equipment.getPrice());
            }
            case "clothes" -> {
                ClothesCache.loadCache();
                int n = (int) (Math.random() * 100 % 2) + 1;
                Clothes clothes = ClothesCache.getId("1");
                switch (n) {
                    case 1 -> clothes = ClothesCache.getId("1");
                    case 2 -> clothes = ClothesCache.getId("2");
                    default -> System.out.println("There is no clothes like that!");
                }
                Kind=equipment.getQuality()+" "+clothes.getType();
                Value=clothes.getValue() * equipment.getMult();
                Price=clothes.getValue() * equipment.getPrice();
                System.out.println("Clothes : " + equipment.getQuality() + " " + clothes.getType() + ", value : " + clothes.getValue() * equipment.getMult() + ", Price : " + clothes.getValue() * equipment.getPrice());
            }
            case "helmet" -> {
                HelmetCache.loadCache();
                int n = (int) (Math.random() * 100 % 2) + 1;
                Helmet helmet = HelmetCache.getId("1");
                switch (n) {
                    case 1 -> helmet = HelmetCache.getId("1");
                    case 2 -> helmet = HelmetCache.getId("2");
                    default -> System.out.println("There is no helmet like that!");
                }
                Kind=equipment.getQuality()+" "+helmet.getType();
                Value=helmet.getValue() * equipment.getMult();
                Price=helmet.getValue() * equipment.getPrice();
                System.out.println("Helmet : " + equipment.getQuality() + " " + helmet.getType() + ", value : " + helmet.getValue() * equipment.getMult() + ", Price : " + helmet.getValue() * equipment.getPrice());
            }
            case "shoe" -> {
                ShoeCache.loadCache();
                int n = (int) (Math.random() * 100 % 2) + 1;
                Shoe shoe = ShoeCache.getId("1");
                switch (n) {
                    case 1 -> shoe = ShoeCache.getId("1");
                    case 2 -> shoe = ShoeCache.getId("2");
                    default -> System.out.println("There is no shoe like that!");
                }
                Kind=equipment.getQuality()+" "+shoe.getType();
                Value=shoe.getValue() * equipment.getMult();
                Price=shoe.getValue() * equipment.getPrice();
                System.out.println("Shoe : " + equipment.getQuality() + " " + shoe.getType() + ", value : " + shoe.getValue() * equipment.getMult() + ", Price : " + shoe.getValue() * equipment.getPrice());
            }
            default -> System.out.println("There is no equipment called that!");
        }
    }
    public static void showEquipment(User user, String equipment) {
        System.out.println(" [" + user.getName() + "] : " + equipment);
    }
    private static String getRandomColor(double ratio) {
        return quality[(int)(ratio*quality.length)];
    }
    private static int getRandomPrice(double ratio) {
        return (int)((ratio+0.1)*(Math.random()*10+80) );
    }
    private static int getRandomMult(double ratio) {
        return (int)((ratio+0.1)*(Math.random()*10+80));
    }
}
