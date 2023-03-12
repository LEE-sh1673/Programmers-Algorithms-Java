package me.lee_sh1673.level2.miro_escape;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MazeEscapeTest {

    static String[][] maps = new String[][]{
        {"SOOOL", "XXXXO", "OOOOO", "OXXXX", "OOOOE"},
        {"LOOXS", "OOOOX", "OOOOO", "OOOOO", "EOOOO"}
    };

    @Test
    @DisplayName("predict() 테스트")
    void should_find_correct_path() {
        MazeEscape mazeEscape = new MazeEscape(maps[0]);
        assertThat(mazeEscape.sol()).isEqualTo(16);

        mazeEscape = new MazeEscape(maps[1]);
        assertThat(mazeEscape.sol()).isEqualTo(-1);
    }

}