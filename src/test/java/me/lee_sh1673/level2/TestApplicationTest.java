package me.lee_sh1673.level2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestApplicationTest {

    @Test
    @DisplayName("Test junit5")
    void testString() {
        // given
        TestApplication application = new TestApplication();

        // when
        String actual = application.testString();

        // then
        assertThat(actual).isEqualTo("testString");
    }
}