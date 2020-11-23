package main.java.team.animal_games.rule;

public class Rule {
    //store the name of the game
    private String name;
    //store the content of the rule
    private String rule;

    //default constructor
    public Rule() {
        name = "";
        rule = "";
    }

    /**
     * @param name name of the game inputted
     * @param rule content of the rule inputted
     */
    public Rule(String name, String rule) {
        this.name = name;
        this.rule = rule;
    }

    /**
     * @return name of the game
     */
    public String getName() {
        return name;
    }

    /**
     * @param rule content of the rule inputted
     */
    public void setRule(String rule) {
        this.rule = rule;
    }

    /**
     * @return content of the rule
     */
    public String getRule() {
        return rule;
    }
}
