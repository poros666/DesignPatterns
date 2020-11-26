package main.java.team.animal_games.ceremony;

class Leader extends Participant {
    private Team team;

    public Leader(Position p, String n, Team t) {
        super(p, n);
        team = t;
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        super.operation();
        System.out.println("animal is a leader,so its team follows it");
        team.operation();
    }

    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        super.showInfo();
        System.out.println("the animal leads a team " + team.getName());
    }

    @Override
    public void changePosition(Position p) {
        // TODO Auto-generated method stub
        super.changePosition(p);
        System.out.println("animal is a leader,so its team follows it");
        team.changePosition(p);
    }
}