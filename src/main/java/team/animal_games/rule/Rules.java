package main.java.team.animal_games.rule;

import java.util.Vector;

public class Rules {
    //a container that contains rules
    private static Vector<Rule> rules;
    //the singleton of rules
    private static Rules instance=new Rules();

    //private constructor
    private Rules() {
        rules = new Vector<Rule>();
    }

    /**
     * find the rule of the game inputted
     * @param name name of the game inputted
     * @return the rule matched the game
     */
    private static Rule findRule(String name) {
        for (Rule rule : rules) {
            if (rule.getName().equals(name))
                return rule;
        }
        return null;
    }

    /**
     * @return the singleton of rules
     */
    public static Rules getInstance() {
        System.out.println("Rules::getInstance()::\"get singleton\"");
        return instance;
    }

    //use the name of the game to find the rule matched
    public String getRule(String name) {
        if(findRule(name)!=null)
        return findRule(name).getRule();
        else
            return "No this game";
    }

    //set the rule
    public void setRule(String name, String rule) {
        findRule(name).setRule(rule);
    }

    //add new rule into the container that contains rules
    public void addRule(String name, String rule) {
        Rule newRule = new Rule(name, rule);
        rules.add(newRule);
    }

    //remove rule from the container
    public void removeRule(String name) {
        rules.remove(findRule(name));
    }
}
