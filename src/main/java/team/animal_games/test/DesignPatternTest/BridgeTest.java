package animal_games.test.DesignPatternTest;

import animal_games.rest.Dormitory.*;

public class BridgeTest {
    private static void testBridge(){
        Style commonStyle=new CommonStyle();
        System.out.println("新建一个Style对象，commonStyle");
        Style luxuriousStyle=new LuxuriousStyle();
        System.out.println("新建一个Style对象，luxuriousStyle");
        Dormitory aquaticDormitory=new AquaticDormitory(commonStyle);
        System.out.println("使用commonStyle创建一个aquaticDormitory");
        aquaticDormitory.getDetails();
        Dormitory landDormitory=new LandDormitory(luxuriousStyle);
        System.out.println("使用luxuriousStyle创建一个landDormitory");
        landDormitory.getDetails();
        Dormitory airDormitory=new AirDormitory(commonStyle);
        System.out.println("使用commonStyle创建一个airDormitory");
        airDormitory.getDetails();
    }

    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Bridge]Pattern —————————————-------------------------------------————");
        System.out.println("Dormitory : Dormitory() : Construct a Dormitory object with a Style object as a parameter to achieve decoupling of Style from the Dormitory itself.");
        System.out.println("Style : Style() : Construct a Style object for the Dormitory's constructing.");

        testBridge();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
