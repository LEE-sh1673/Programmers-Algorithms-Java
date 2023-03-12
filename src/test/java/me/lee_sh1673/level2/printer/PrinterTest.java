package me.lee_sh1673.level2.printer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrinterTest {

    @Test
    @DisplayName("predict() 테스트")
    void should_find_correct_path() {
        Printer printer = new Printer(new int[]{2, 1, 3, 2}, 2);
        Assertions.assertThat(printer.sol()).isEqualTo(1);

        printer = new Printer(new int[]{1, 1, 9, 1, 1, 1}, 0);
        Assertions.assertThat(printer.sol()).isEqualTo(5);
    }

}