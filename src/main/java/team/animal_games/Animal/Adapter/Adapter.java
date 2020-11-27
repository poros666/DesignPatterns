package main.java.team.animal_games.Animal.Adapter;

public class Adapter extends Tiger implements FlyTiger{
    private Tiger adaptee;
    private String Name;
    /**
     * @description: 构造函数，通过一个tiger实例初始化内部被适配者
     * @param tiger use a Tiger to initial adaptee
     */
    public Adapter(Tiger tiger){
        this.adaptee=tiger;
    }
    /**
     * @description: action methods of a FlyTiger extends FlyTiger
     */
    @Override
    public void move() {
        System.out.println("Adapter: move: let FlyTiger could fly");
        System.out.println("现在这只老虎不仅可以奔跑，还可以飞行。");
    }
    /**
     * @description: action methods of a FlyTiger extends FlyTiger
     */
    @Override
    public void eat() {
        System.out.println("Adapter: eat: let FlyTiger eat FlyTiger's food");
        System.out.println("现在这只老虎吃飞虎的食物。");
    }
    /**
     * @description: action methods of a FlyTiger extends FlyTiger
     */
    @Override
    public void sleep() {
        System.out.println("Adapter: sleep: let FlyTiger rest in FlyTiger's room");
        System.out.println("现在这只老虎睡飞虎的宿舍。");
    }
    @Override
    public void setName(String name) {
        this.Name = name;
    }
    @Override
    public String getName() {
        return this.Name;
    }
}
