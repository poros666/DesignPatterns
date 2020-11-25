package animal_games.test.DesignPatternTest;

import animal_games.rest.Dormitory.*;
import animal_games.rest.Dormitory.Criteria.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriteriaTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Criteria]Pattern —————————————-------------------------------------————");
        System.out.println("AndCriteria:AndCriteria(Criteria criteria, Criteria otherCriteria):" +
                "使用两种criteria创建AndCriteria");
        System.out.println("AndCriteria:meetCriteria(List<Dormitory> dormitories):" +
                "传入一个dormitory列表，分别使用类内部的两种criteria过滤取得交集");
        System.out.println("OrCriteria:OrCriteria(Criteria criteria, Criteria otherCriteria):" +
                "使用两种criteria创建OrCriteria");
        System.out.println("OrCriteria:meetCriteria(List<Dormitory> dormitories):" +
                "传入一个dormitory列表，分别使用类内部的两种criteria过滤取得并集");
        System.out.println("CriteriaAir:meetCriteria(List<Dormitory> dormitories):" +
                "返回传入的list中类型为Air的元素组成的新的list");
        System.out.println("CriteriaAquatic:meetCriteria(List<Dormitory> dormitories):" +
                "返回传入的list中类型为Aquatic的元素组成的新的list");
        System.out.println("CriteriaLand:meetCriteria(List<Dormitory> dormitories):" +
                "返回传入的list中类型为Land的元素组成的新的list");
        System.out.println("CriteriaCommon:meetCriteria(List<Dormitory> dormitories):" +
                "返回传入的list中style类型为Common的元素组成的新的list");
        System.out.println("CriteriaLuxurious:meetCriteria(List<Dormitory> dormitories):" +
                "返回传入的list中style类型为Luxurious的元素组成的新的list");
        System.out.println("");

        testCriteria();
        System.out.println("");

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }

    public static void testCriteria(){

        System.out.println("初始化宿舍");
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
        System.out.println("初始化宿舍完成");
        printDormitory(dormitoryList);
        System.out.println("");

        System.out.println("初始化标准");
        Criteria air=new CriteriaAir();
        Criteria land=new CriteriaLand();
        Criteria aquatic=new CriteriaAquatic();
        Criteria common=new CriteriaCommon();
        Criteria luxurious=new CriteriaLuxurious();
        Criteria air_and_common=new AndCriteria(air,common);
        Criteria land_or_luxurious=new OrCriteria(land,luxurious);
        System.out.println("初始化标准完成");
        System.out.println("");

        while(true){
            try {
                System.out.println("\n输入过滤标准：1.air，2.land,3.aquatic,4.common,5.luxurious" +
                        ",6.air_and_common,7.land_or_luxurious,输入其他数字则退出:");
                Scanner sc = new Scanner(System.in);
                int number=sc.nextInt();

                switch(number){
                    case 1:{
                        System.out.println("\n过滤标准air:");
                        printDormitory(air.meetCriteria(dormitoryList));
                        break;
                    }
                    case 2:{
                        System.out.println("\n过滤标准land:");
                        printDormitory(land.meetCriteria(dormitoryList));
                        break;

                    }
                    case 3:{
                        System.out.println("\n过滤标准aquatic:");
                        printDormitory(aquatic.meetCriteria(dormitoryList));
                        break;

                    }
                    case 4:{
                        System.out.println("\n过滤标准common:");
                        printDormitory(common.meetCriteria(dormitoryList));
                        break;

                    }
                    case 5:{
                        System.out.println("\n过滤标准luxurious:");
                        printDormitory(luxurious.meetCriteria(dormitoryList));
                        break;

                    }
                    case 6:{
                        System.out.println("\n过滤标准air_and_common:");
                        printDormitory(air_and_common.meetCriteria(dormitoryList));
                        break;

                    }
                    case 7:{
                        System.out.println("\n过滤标准land_or_luxurious:");
                        printDormitory(land_or_luxurious.meetCriteria(dormitoryList));
                        break;

                    }
                    default:{
                        break;
                    }
                }
            break;
            }catch (Exception e){
                System.out.println("输入数字无效，重新输入");
            }
        }

    }


    public static void printDormitory(List<Dormitory> dormitories) {
        for (Dormitory dormitory:dormitories){
            System.out.println("得到的宿舍实例：Dormitory: Type:"+dormitory.getType()+", Style:"+dormitory.getStyleType());

        }
    }
}
