package main.java.team.animal_games.ceremony;

class StagePositionHandler extends PositionHandler {
    public StagePositionHandler() {
        super(new Position("stage"));
    }

    public StagePositionHandler(Position p) {
        super(p);
    }

    @Override
    public void handle(Participant p) {
        // TODO Auto-generated method stub
        System.out.println("stage handling");
        super.handle(p);
    }
}
