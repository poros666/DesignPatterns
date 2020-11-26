package main.java.team.animal_games.ceremony;

class Perform extends BaseCommand {
    private String performName;

    public Perform(String p, String con) {
        super(con);
        performName = p;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
        System.out.println("A" + performName + "performance");
    }
}
