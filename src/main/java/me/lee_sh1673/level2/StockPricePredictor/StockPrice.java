package me.lee_sh1673.level2.StockPricePredictor;

public class StockPrice {

    private final int price;

    private final int duration;

    public StockPrice(final int price, final int duration) {
        this.price = price;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }
}

