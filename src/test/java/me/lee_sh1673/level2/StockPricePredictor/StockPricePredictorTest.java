package me.lee_sh1673.level2.StockPricePredictor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StockPricePredictorTest {

    @Test
    @DisplayName("predict() 테스트")
    void sol() {
        // givenr
        StockPricePredictor predictor = new StockPricePredictor();

        // when & then
        assertThat(predictor.predict(new int[]{1, 2, 3, 2, 3}))
            .containsExactly(4, 3, 1, 1, 0);

        // when & then
        assertThat(predictor.predict(new int[]{2, 2, 1, 2}))
            .containsExactly(2, 1, 1, 0);
    }
}