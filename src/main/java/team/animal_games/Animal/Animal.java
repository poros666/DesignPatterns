package main.java.team.animal_games.Animal;
import main.java.team.animal_games.state.State;

import java.util.*;

public class Animal {
    private State state;
    private String name;
    /*
    ****属性Map说明
    * 力量STR 智力INT 体质CON 敏捷AGI 精神MEN 耐力VIT 幸运LUK 智慧WIS
     */
    private Map<String, Integer> attribute;
    private double worth = 1;
    private String profile = "这是一只动物";
    double getWorth(){
        return this.worth;
    }
    String getDescription(){
        return this.profile;
    }
    public Animal(){
        attribute=new HashMap<String, Integer>();
        Random r=new Random();

        attribute.put("STR",(Integer)r.nextInt(10));
        attribute.put("INT",(Integer)r.nextInt(10));
        attribute.put("CON",(Integer)r.nextInt(10));
        attribute.put("AGI",(Integer)r.nextInt(10));
        attribute.put("MEN",(Integer)r.nextInt(10));
        attribute.put("VIT",(Integer)r.nextInt(10));
        attribute.put("LUK",(Integer)r.nextInt(10));
        attribute.put("WIS",(Integer)r.nextInt(10));
    };
    public Animal(State s, String n){
        this.state = s;
        this.name = n;
        attribute=new HashMap<String, Integer>();
        Random r=new Random();

        attribute.put("STR",(Integer)r.nextInt(10));
        attribute.put("INT",(Integer)r.nextInt(10));
        attribute.put("CON",(Integer)r.nextInt(10));
        attribute.put("AGI",(Integer)r.nextInt(10));
        attribute.put("MEN",(Integer)r.nextInt(10));
        attribute.put("VIT",(Integer)r.nextInt(10));
        attribute.put("LUK",(Integer)r.nextInt(10));
        attribute.put("WIS",(Integer)r.nextInt(10));
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setState(State s){
        this.state=s;
    }
    public State getState(){
        return this.state;
    }
    public void showState(){
        this.state.showState();
    }
    public Map<String,Integer> getAttribute(){
        return this.attribute;
    }
}
