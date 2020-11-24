package main.java.team.animal_games.equipment.basketball;

public class BasketballDemo {
    public static void main(String[] args) {
        BasketballCache.loadCache();

        Basketball basketball1 = (Basketball) BasketballCache.getId("1");
        System.out.println("Basketball : " + basketball1.getType());

        Basketball basketball2 = (Basketball) BasketballCache.getId("2");
        System.out.println("Basketball : " + basketball2.getType());

    }
}