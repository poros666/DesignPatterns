package main.java.team.animal_games.ceremony;

//a kind of normal commands,nothing special,sing means all the animals singing the national song
public class Sing extends BaseCommand
{
    public Sing(String con)//con is the content of the command
    {
        super(con,false);
    }

    @Override
    public void execute() {
        // overrided method to show it's a singing command
        super.execute();
        System.out.println("singing together");
    }
}