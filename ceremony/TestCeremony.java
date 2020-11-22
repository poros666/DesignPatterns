public class TestCeremony
{
    public static void main(String args[])
    {
        Position stage=new Position("stage");
        Position n1,n2,n3;
        n1=new Position("normal1");
        n2=new Position("normal2");
        n3=new Position("normal3");
        Host host=new Host(stage, "holt");
        Team team1=new Team(n1, "team1");
        for(int i=0;i<8;i++)
        {
            String n="athlete"+String.valueOf(i);
            Athlete athlete=new Athlete(n1,n);
            team1.addAthlete(athlete);
        }
        Leader leader=new Leader(n1, "leader1", team1);
        host.showInfo();
        leader.showInfo();
        NormalPositionHandler handler1=new NormalPositionHandler(n2);
        NormalPositionHandler handler2=new NormalPositionHandler(n3);
        handler2.setNext(handler1);
        handler2.handle(leader);

        Perform dance=new Perform("ballet", "team1 dance");
        host.addCommand(dance);
        host.giveCommand();

        System.out.println(Position.positionNum);
    }
}