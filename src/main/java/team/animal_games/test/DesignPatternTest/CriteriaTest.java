package animal_games.test.DesignPatternTest;

import animal_games.rest.Dormitory.*;
import animal_games.rest.Dormitory.Criteria.*;

import java.util.ArrayList;
import java.util.List;

public class CriteriaTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Criteria]Pattern —————————————-------------------------------------————");


        testCriteria();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }

    public static void testCriteria(){
        Style commonStyle=new CommonStyle();
        Style luxuriousStyle=new LuxuriousStyle();
        Dormitory dormitory1=new LandDormitory(commonStyle);
        Dormitory dormitory2=new LandDormitory(luxuriousStyle);
        Dormitory dormitory3=new AirDormitory(commonStyle);
        Dormitory dormitory4=new AirDormitory(luxuriousStyle);
        Dormitory dormitory5=new AirDormitory(commonStyle);
        Dormitory dormitory6=new AirDormitory(luxuriousStyle);
        Dormitory dormitory7=new AquaticDormitory(commonStyle);
        Dormitory dormitory8=new AquaticDormitory(luxuriousStyle);
        Dormitory dormitory9=new AquaticDormitory(commonStyle);
        Dormitory dormitory10=new AquaticDormitory(luxuriousStyle);

        List<Dormitory> dormitoryList=new ArrayList<>();
        dormitoryList.add(dormitory1);
        dormitoryList.add(dormitory2);
        dormitoryList.add(dormitory3);
        dormitoryList.add(dormitory4);
        dormitoryList.add(dormitory5);
        dormitoryList.add(dormitory6);
        dormitoryList.add(dormitory7);
        dormitoryList.add(dormitory8);
        dormitoryList.add(dormitory9);
        dormitoryList.add(dormitory10);

        printDormitory(dormitoryList);

        Criteria air=new CriteriaAir();
        Criteria land=new CriteriaLand();
        Criteria aquatic=new CriteriaAquatic();
        Criteria common=new CriteriaCommon();
        Criteria luxurious=new CriteriaLuxurious();
        Criteria air_and_common=new AndCriteria(air,common);
        Criteria land_or_luxurious=new OrCriteria(land,luxurious);

        System.out.println("\nair:");
        printDormitory(air.meetCriteria(dormitoryList));

        System.out.println("\nland:");
        printDormitory(land.meetCriteria(dormitoryList));

        System.out.println("\naquatic:");
        printDormitory(aquatic.meetCriteria(dormitoryList));

        System.out.println("\ncommon:");
        printDormitory(common.meetCriteria(dormitoryList));

        System.out.println("\nluxurious:");
        printDormitory(luxurious.meetCriteria(dormitoryList));

        System.out.println("\nair_and_common:");
        printDormitory(air_and_common.meetCriteria(dormitoryList));

        System.out.println("\nland_or_luxurious:");
        printDormitory(land_or_luxurious.meetCriteria(dormitoryList));
    }


    public static void printDormitory(List<Dormitory> dormitories) {
        for (Dormitory dormitory:dormitories){
            System.out.println("Dormitory: Type:"+dormitory.getType()+", Style:"+dormitory.getStyleType());
        }
    }
}
