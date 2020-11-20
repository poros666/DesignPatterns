package animal_games.Animal.Adapter;

public class Adapter extends Tiger implements FlyTiger{
    private Tiger adaptee;
    private String Name;
    public Adapter(Tiger tiger){
        this.adaptee=tiger;
    }

    @Override
    public void move() {
        System.out.println("现在这只老虎不仅可以奔跑，还可以飞行。");
    }

    @Override
    public void eat() {
        System.out.println("现在这只老虎吃飞虎的食物。");
    }

    @Override
    public void sleep() {
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
