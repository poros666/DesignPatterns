package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.rule.Rules;

public class SingletonTest {
    public static void main(String[] args) {
        Rules rules=Rules.getInstance();
        System.out.println("添加新规则");
        rules.addRule("Running","don't fly and don't swim");
        rules.addRule("Flying","don't run and don't play basketball");
        rules.addRule("Swimming","have a nice day");
        System.out.println("输出跑步的规则："+rules.getRule("Running"));
        System.out.println("更改游泳的规则");
        rules.setRule("Swimming","Hello World");
        System.out.println("输出游泳的规则："+rules.getRule("Swimming"));
        System.out.println("删除飞行的规则");
        rules.removeRule("Flying");
        System.out.println("飞行的规则："+rules.getRule("Flying") );
    }
}
