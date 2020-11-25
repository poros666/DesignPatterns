package main.java.team.animal_games.equipment;

public class Quality implements Equipment {
    private String quality;
    private int price;
    private int mult;

    public Quality(String quality){
        this.quality = quality;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMult(int mult) {
        this.mult = mult;
    }

    public int getPrice() {
        return this.price;
    }
    public int getMult() {
        return this.mult;
    }
    public String getQuality() {
        return this.quality;
    }

    @Override
    public void draw() {
        System.out.println("Equipment: quality : " + quality
                +", price : " + price +", multiplying power  :" + mult);
    }
}
