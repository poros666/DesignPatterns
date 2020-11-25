package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.rest.Dormitory.*;

import java.util.Scanner;

public class BridgeTest {
    private static void testBridge(){
        Style commonStyle=new CommonStyle();
        Style luxuriousStyle=new LuxuriousStyle();
        while(true){
            try {
                Style s;
                System.out.println("\n输入要创建的style类型：1.Common，2.Luxurious,输入其他数字则退出:");
                Scanner sc = new Scanner(System.in);
                Dormitory d;
                int number=sc.nextInt();
                if(number==1){
                    s=commonStyle;
                }
                else if(number==2){
                    s=luxuriousStyle;
                }
                else{
                    break;
                }
                System.out.println("输入要创建的style类型：1.Air，2.Land,3.Aquatic,输入其他数字则退出:");
                Scanner scc = new Scanner(System.in);
                int number2=scc.nextInt();
                if(number2==1){
                    d=new AirDormitory(s);
                }
                else if(number2==2){
                    d=new LandDormitory(s);
                }
                else if(number2==3){
                    d=new AquaticDormitory(s);
                }
                else{
                    break;
                }
                System.out.println(d.getDetails());

            }catch (Exception e){
                System.out.println("输入数字无效，重新输入");
            }
        }


//        Dormitory aquaticDormitory=new AquaticDormitory(commonStyle);
//        System.out.println(aquaticDormitory.getDetails());
//        Dormitory landDormitory=new LandDormitory(luxuriousStyle);
//        System.out.println(landDormitory.getDetails());
//        Dormitory airDormitory=new AirDormitory(commonStyle);
//        System.out.println(airDormitory.getDetails());
    }

    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Bridge]Pattern —————————————-------------------------------------————");
        System.out.println("Dormitory:Dormitory(Style style):Dormitory的构造函数，使用Style初始化Style");
        System.out.println("Dormitory:getDetails():返回Dormitory的类型和Style类型");
        System.out.println("Dormitory:getType():返回Dormitory的类型");
        System.out.println("Dormitory:getStyleType():返回Dormitory的Style类型");
        System.out.println("AirDormitory:AirDormitory(Style style):创建具体Dormitory类，设置类型为Air");
        System.out.println("AquaticDormitory:AquaticDormitory(Style style):创建具体Dormitory类，设置类型为Aquatic");
        System.out.println("LandDormitory:LandDormitory(Style style):创建具体Dormitory类，设置类型为Land");
        System.out.println("Style:getType():返回Style类型");
        System.out.println("CommonStyle:CommonStyle():CommonStyle的创建函数，设置类型为Common");
        System.out.println("LuxuriousStyle:LuxuriousStyle():LuxuriousStyle的创建函数，设置类型为Luxurious");
        System.out.println("");
        testBridge();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
