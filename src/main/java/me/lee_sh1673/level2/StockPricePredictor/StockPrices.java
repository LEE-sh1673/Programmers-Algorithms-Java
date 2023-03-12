package me.lee_sh1673.level2.StockPricePredictor;

import java.util.Stack;

public class StockPrices {

    private final Stack<StockPrice> stockPrices;

    public StockPrices() {
        stockPrices = new Stack<>();
    }

    public boolean isEmpty() {
        return stockPrices.isEmpty();
    }

    public void addPrice(final StockPrice stockPrice) {
        stockPrices.add(stockPrice);
    }

    public StockPrice popPrice() {
        return stockPrices.pop();
    }

    public boolean hasDecreasingPriceOrder(final int price) {
        return !stockPrices.isEmpty() && stockPrices.peek().getPrice() > price;
    }
}
