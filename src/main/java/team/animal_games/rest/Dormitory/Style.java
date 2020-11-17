package animal_games.rest.Dormitory;

public abstract class Style {
    protected StyleType styleType;

    protected StyleType getStyleType() {
        return styleType;
    }

    public abstract StyleType getStyle();
}
