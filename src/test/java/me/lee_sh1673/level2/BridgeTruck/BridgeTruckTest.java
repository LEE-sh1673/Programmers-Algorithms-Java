package me.lee_sh1673.level2.BridgeTruck;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BridgeTruckTest {

    @Test
    @DisplayName("sol() 테스트")
    void should_find_correct_path() {
        BridgeTruck bridgeTruck = new BridgeTruck(2, 10, new int[]{7, 4, 5, 6});
        assertThat(bridgeTruck.sol()).isEqualTo(8);

        bridgeTruck = new BridgeTruck(2, 10, new int[]{7});
        assertThat(bridgeTruck.sol()).isEqualTo(3);

        bridgeTruck = new BridgeTruck(10, 100, new int[]{10});
        assertThat(bridgeTruck.sol()).isEqualTo(11);

        bridgeTruck = new BridgeTruck(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        assertThat(bridgeTruck.sol()).isEqualTo(110);

        bridgeTruck = new BridgeTruck(5, 5, new int[]{2, 2, 2, 2, 1, 1, 1, 1, 1});
        assertThat(bridgeTruck.sol()).isEqualTo(19);
    }
}