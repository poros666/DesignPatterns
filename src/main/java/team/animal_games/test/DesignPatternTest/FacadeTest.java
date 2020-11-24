package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.situation.Situation;

import java.util.Map;

public class FacadeTest {
    public static void main(String[] args) {
        Situation mysituation = new Situation();
        System.out.println("================================FacadeTest================================");
        System.out.println("Situation is a Facade class,providing getSituation() as an interface of inner classes!");
        Map<String, Integer> ans = mysituation.getSituation();
        System.out.println("getSituation(): temperature:" + ans.get("temperature") + " ,visibility:" +
                ans.get("visibility"));
    }
}
