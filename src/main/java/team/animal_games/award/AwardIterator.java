package main.java.team.animal_games.award;

public class AwardIterator implements Iterator {
    private AwardProcess awardList;
    private int index;

    public AwardIterator(AwardProcess awardProcess) {
        awardList = awardProcess;
    }

    @Override
    public boolean hasNext() {
        if (index < awardList.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public void next() {
        if (hasNext()) {
            index++;
        }
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public Award getCurrent(int index) {
        return awardList.getElement(index);
    }

    public void show(){
        System.out.print("Announce award: ");
        System.out.println(awardList.getElement(index));
        System.out.println("Please come to the stage to receive the prize!");
    }
}
