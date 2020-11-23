package main.java.team.animal_games.award;


class Participant {
    protected Position position;
    private String name;
    private int need_seat;

    public Participant(Position p, String n, int s) {
        position = p;
        name = n;
        need_seat = s;
    }

    public void showInfo() {
        System.out.printf("Animal:%s,Position:%s,num:%d\n", name, position, need_seat);
    }

    public void operation() {

    }

    public void changePosition(Position p) {

    }

    public int getSeatNum() {
        return need_seat;
    }

    public String getName() {
        return name;
    }
}
