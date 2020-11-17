package animal_games.rest.Dormitory;

public abstract class Dormitory {
    protected DormitoryType type;
    protected Style style;

    public Dormitory(Style style) {
        this.style = style;
    }

    public abstract void getDetails();
}
