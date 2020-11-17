package animal_games.rest.Dormitory;

public class LandDormitory extends Dormitory{
    public LandDormitory(Style style){
        super(style);
        this.type=DormitoryType.Aquatic;
    }
    @Override
    public void getDetails() {
        System.out.println(this.type+" Dormitory with "+this.style.getStyleType()+"Style Type");
    }
}
