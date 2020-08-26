package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
    void itShowsEmptyMinefield() {
        assertArrayEquals(new String[] { "000", "000" }, displayMinefield(new String[] { "...", "..."}));
    }

    @Test
    void isShowsCorrectNumberOfROws() {
        assertArrayEquals(
                new String[] { "000", "000", "000" },
                displayMinefield(new String[] { "...", "...", "..." })
        );
    }

    private String[] displayMinefield(String[] strings) {
        return new String[] {
                "000", "000"
        };
    }
}
