package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.Animal.Adapter.Adapter;
import main.java.team.animal_games.Animal.Adapter.FlyTiger;
import main.java.team.animal_games.Animal.Adapter.Tiger;

public class TestAdapter {
    public static void main(String[] arg){
        System.out.println("—————————————-------------------------------------———— Test[Adapter]Pattern —————————————-------------------------------------————");
        System.out.println("Follow are (classname: methods: action)！"+'\n');

        System.out.println("Adapter: move: let FlyTiger could fly");
        System.out.println("Adapter: eat: let FlyTiger eat FlyTiger's food");
        System.out.println("Adapter: sleep: let FlyTiger rest in FlyTiger's room"+'\n');

        Tiger tiger = new Tiger();
        tiger.move();
        System.out.println("适配器后：");
        FlyTiger flyTiger = new Adapter(tiger);
        flyTiger.setName("aowu");
        flyTiger.move();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
