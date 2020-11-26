
public class ChangePosition extends BaseCommand
{
    Position direction;
    public ChangePosition(Position d, String con)
    {
        super(con,true);
        direction=d;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
        System.out.println("go to"+direction.getName());
    }
}
