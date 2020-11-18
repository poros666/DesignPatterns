package main.java.team.animal_games.rule;

public class Rule {
    private String name;
    private String rule;


    public Rule(){
        name="";
        rule="";
    }

    public Rule(String name,String rule)
    {
        this.name=name;
        this.rule=rule;
    }
    public String getName() {
        return name;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getRule() {
        return rule;
    }
}
