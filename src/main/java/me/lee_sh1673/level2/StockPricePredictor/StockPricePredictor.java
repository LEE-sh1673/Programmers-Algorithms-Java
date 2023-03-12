package me.lee_sh1673.level2.StockPricePredictor;

public class StockPricePredictor {

    private final StockPrices stockPrices;


    public StockPricePredictor() {
        this.stockPrices = new StockPrices();
    }

    public int[] predict(final int[] prices) {
        int[] predicts = new int[prices.length];
        calculateDecreasingPrices(predicts, prices);
        calculateIncreasingPrices(predicts, prices);
        return predicts;
    }

    private void calculateDecreasingPrices(int[] predicts, final int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            while (stockPrices.hasDecreasingPriceOrder(prices[i])) {
                StockPrice stockPrice  = stockPrices.popPrice();
                predicts[stockPrice.getDuration()] =  i - stockPrice.getDuration();
            }
            stockPrices.addPrice(new StockPrice(prices[i], i));
        }
    }

    private void calculateIncreasingPrices(final int[] predicts, final int[] prices) {
        while (!stockPrices.isEmpty()) {
            StockPrice stockPrice = stockPrices.popPrice();
            int idx = stockPrice.getDuration();

            if (predicts[idx] == 0) {
                predicts[idx] = prices.length - stockPrice.getDuration() - 1;
            }
        }
    }
}
