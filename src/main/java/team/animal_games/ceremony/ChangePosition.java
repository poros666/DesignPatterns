package main.java.team.animal_games.ceremony;

class ChangePosition extends BaseCommand {
    Position direction;

    public ChangePosition(Position d, String con) {
        super(con);
        direction = d;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
        System.out.println("go to" + direction.getName());
    }
}
