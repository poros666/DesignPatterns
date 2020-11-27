package main.java.team.animal_games.ceremony;

//a kind of command,nothing special
public class Toast extends BaseCommand
{
    private String words;//the words said as a toast
    public Toast(String w, String con)//w is the words, and con is the content of the command
    {
        super(con,false);
        words=w;
    }
    @Override
    public void execute() {
        // overrided method to show it's a toast command
        super.execute();
        System.out.println("Animal toasting: "+words);
    }
}
