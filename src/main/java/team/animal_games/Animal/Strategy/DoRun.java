package main.java.team.animal_games.Animal.Strategy;

import java.util.Map;

/**
 * @author Raven
 */
public class DoRun implements ActionStrategy {
    @Override
    public double doAction(Map<String, Integer> statistics){
        double weight = 0;
        int STR = statistics.get("STR");
        int INT = statistics.get("INT");
        int CON = statistics.get("CON");
        int AGI = statistics.get("AGI");
        int MEN = statistics.get("MEN");
        int VIT = statistics.get("VIT");
        int LUK = statistics.get("LUK");
        int WIS = statistics.get("WIS");
        weight = (8*CON + VIT + AGI)*(0.8 + 0.01*MEN + 0.01*WIS);
        return weight;
    }
}
