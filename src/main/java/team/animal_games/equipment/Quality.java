package main.java.team.animal_games.equipment;

public class Quality implements Equipment {
    private String quality;
    private int price;
    private int mult;

    public Quality(String quality){
        this.quality = quality;
    }
    /**
     * @description: initial objects
     *
     **/
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * @description: set value
     *
     **/
    public void setMult(int mult) {
        this.mult = mult;
    }
    /**
     * @description: set multiply
     *
     **/
    public int getPrice() {
        return this.price;
    }
    /**
     * @description: return price
     *
     **/
    public int getMult() {
        return this.mult;
    }
    /**
     * @description: return multiply
     *
     **/
    public String getQuality() {
        return this.quality;
    }
    /**
     * @description: return quality
     *
     **/
    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Equipment: quality : " + quality
                +", price : " + price +", multiplying power  :" + mult);
    }
}
