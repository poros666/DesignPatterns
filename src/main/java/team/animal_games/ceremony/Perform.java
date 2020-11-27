package main.java.team.animal_games.ceremony;

//one kind of commands, nothing special
public class Perform extends BaseCommand
{
    private String performName;//the name of the perform
    public Perform(String p, String con)//p is the name of perform and con is the content of the command
    {
        super(con,false);
        performName=p;
    }
    @Override
    public void execute() {
        // the overrided method to show the command is a perform command
        super.execute();
        System.out.println("A"+performName+"performance");
    }
}
