package main.java.team.animal_games.ceremony;

public class Sing extends BaseCommand
{
    public Sing(String con)
    {
        super(con,false);
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
        System.out.println("singing together");
    }
}