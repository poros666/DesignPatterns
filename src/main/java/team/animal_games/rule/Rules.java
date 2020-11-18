package main.java.team.animal_games.rule;
import java.util.Vector;

public class Rules {
private static Vector<Rule>rules;
private Rules instance;
private Rules(){
    rules=new Vector<Rule>();
}
    private static Rule findRule(String name)
    {
        for(Rule rule:rules)
        {
            if(rule.getName().equals(name))
                return rule;
        }
        return null;
    }
    public Rules getInstance() {
        return instance;
    }

    public String getRule(String name)
    {
        return findRule(name).getRule();
    }
    public void setRule(String name,String rule)
    {
        findRule(name).setRule(rule);
    }
    public void addRule(String name,String rule)
    {
        Rule newRule=new Rule(name,rule);
        rules.add(newRule);
    }
    public void removeRule(String name)
    {
        rules.remove(findRule(name));
    }
}
