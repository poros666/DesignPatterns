package main.java.team.animal_games.Animal.Adapter;

public class TestAdapter {
    public static void main(String[] arg){
        Tiger tiger = new Tiger();
        tiger.move();
        System.out.println("适配器后：");
        FlyTiger flyTiger = new Adapter(tiger);
        flyTiger.setName("aowu");
        flyTiger.move();
    }
}
