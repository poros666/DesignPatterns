package main.java.team.animal_games.equipment.basketball;

public class BasketballDemo {
    public static void main(String[] args) {
        BasketballCache.loadCache();

        Basketball basketball1 = BasketballCache.getId("1");
        System.out.println("Basketball : " + basketball1.getType()+", value : "+basketball1.getValue());

        Basketball basketball2 = BasketballCache.getId("2");
        System.out.println("Basketball : " + basketball2.getType()+", value : "+basketball2.getValue());

    }
}