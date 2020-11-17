package animal_games.rest.Dormitory;

public class AquaticDormitory extends Dormitory {
    public AquaticDormitory(Style style){
        super(style);
        this.type=DormitoryType.Aquatic;
    }
    @Override
    public void getDetails() {
        System.out.println(this.type+" Dormitory with "+this.style.getStyleType()+"Style Type");
    }
}
