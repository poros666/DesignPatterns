package main.java.team.animal_games.award;

import java.util.List;

public class AwardProcess implements Aggregate {
    private List<Award> awardList;

    AwardProcess(List<Award> awardList) {
        this.awardList = awardList;
    }

    public int getLength() {
        return awardList.size();
    }

    public Award getElement(int index) {
        return awardList.get(index);
    }

    @Override
    public AwardIterator getIterator() {
        return new AwardIterator(this);
    }
}
