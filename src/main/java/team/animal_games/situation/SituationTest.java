package team.top.animal_games.situation;

public class SituationTest {
    public static void main(String[] args) {
        Situation mysi = new Situation();
        System.out.println("getSituation(): temperature:"+mysi.getSituation().get("temperature")+" ,visibility:"+mysi.getSituation().get("visibility"));
    }
}
