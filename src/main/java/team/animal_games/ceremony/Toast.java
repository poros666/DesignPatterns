package main.java.team.animal_games.ceremony;

class Toast extends BaseCommand {
    private String words;

    public Toast(String w, String con) {
        super(con);
        words = w;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
        System.out.println("Animal toasting: " + words);
    }
}
