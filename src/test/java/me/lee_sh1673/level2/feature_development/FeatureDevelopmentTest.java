package me.lee_sh1673.level2.feature_development;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FeatureDevelopmentTest {

    private static final FeatureDevelopment featureDevelopment = new FeatureDevelopment();

    @Test
    @DisplayName("개발까지 남은 기간 계산하기")
    void calculate_remain_day() {
        assertThat(featureDevelopment.calculateRemainDay(95, 4)).isEqualTo(2);
        assertThat(featureDevelopment.calculateRemainDay(80, 1)).isEqualTo(20);
        assertThat(featureDevelopment.calculateRemainDay(99, 1)).isEqualTo(1);
        assertThat(featureDevelopment.calculateRemainDay(1, 99)).isEqualTo(1);
        assertThat(featureDevelopment.calculateRemainDay(1, 100)).isEqualTo(1);
        assertThat(featureDevelopment.calculateRemainDay(1, 50)).isEqualTo(2);
        assertThat(featureDevelopment.calculateRemainDay(1, 50)).isEqualTo(2);
    }


    @ParameterizedTest
    @DisplayName("테스트 케이스 수행")
    @MethodSource("provideProgressAndSpeedWithOutput")
    void sol(final int[] progresses, final int[] speeds, final int[] expected) {
        assertThat(featureDevelopment.sol(progresses, speeds)).containsExactly(expected);
    }

    private static Stream<Arguments> provideProgressAndSpeedWithOutput() {
        return Stream.of(
            Arguments.of(new int[]{93, 30, 55}, new int[]{1, 30, 5}, new int[]{2, 1}),
            Arguments.of(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1},
                new int[]{1, 3, 2}),
            Arguments.of(new int[]{1, 1, 1, 1}, new int[]{100, 50, 99, 100}, new int[]{1, 3}),
            Arguments.of(new int[]{1, 1, 1, 1}, new int[]{100, 50, 99, 100}, new int[]{1, 3}),
            Arguments.of(new int[]{99, 99, 99, 90, 90, 90}, new int[]{1, 1, 1, 1, 1, 1},
                new int[]{3, 3})
        );
    }
}