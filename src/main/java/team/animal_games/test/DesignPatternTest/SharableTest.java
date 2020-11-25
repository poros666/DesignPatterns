package main.java.team.animal_games.test.DesignPatternTest;
//import animal_games.rest.Dormitory.CommonStyle;
import main.java.team.animal_games.rest.Dormitory.*;
import main.java.team.animal_games.rest.Dormitory.furniture.FurnitureKind;

public class SharableTest {
    //private  CommonStyle commonStyle=new CommonStyle();
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Copy On Write]Pattern —————————————-------------------------------------————");
        System.out.println("Dormitory : getRoomById() : Get the corresponding room by id.");
        System.out.println("Room : moveFurniture() : Move the furniture to somewhere.");


        Style commonStyle=new CommonStyle();
        System.out.println("新建一个Style对象，commonStyle");
        //Style luxuriousStyle=new LuxuriousStyle();
        System.out.println("新建一个Style对象，luxuriousStyle");
        Dormitory aquaticDormitory=new AquaticDormitory(commonStyle);//新建宿舍楼，这时只会创建一套家具对象

        System.out.println("\nNow let's move the bed of the first room");
        Room room = aquaticDormitory.getRoomById(0);  //获取第一间宿舍
        room.moveFurniture(FurnitureKind.Bed);  //移动第一间宿舍的床，这时会创建备份，在备份上移动。

        System.out.println("\nAgain, let's move the bed of the first room");
        room.moveFurniture(FurnitureKind.Bed);  //再次移动第一间宿舍的床，这时直接移动，不会创建备份。

        System.out.println("\nNow let's move the bed of every room");
        for (int i = 0; i < Dormitory.ROON_NUM; i++) {
            System.out.println("Room " + i + ": ");
            aquaticDormitory.getRoomById(i).moveFurniture(FurnitureKind.Bed);
            System.out.println("\n");
        }
        System.out.println("--------------------------------------------------------------------");
    }
}
