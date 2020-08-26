package no.kristiania.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MineFieldTest {
    @Test
    void itShowsEmptyMinefield() {
        assertArrayEquals(new String[] { "000", "000" }, displayMinefield(new String[] { "...", "..."}));
    }

    @Test
    void isShowsCorrectNumberOfRows() {
        assertArrayEquals(
                new String[] { "000", "000", "000" },
                displayMinefield(new String[] { "...", "...", "..." })
        );
    }

    @Test
    void isShowsCorrectNumberOfColumns() {
        assertArrayEquals(
                new String[] { "0000" },
                displayMinefield(new String[] { "...." })
        );
    }

    @Test
    void itShowsMines() {
        assertArrayEquals(
                new String[] { "***" },
                displayMinefield(new String[] { "***" })
        );
    }

    @Test
    void itShowsHintOnRowOfMine() {
        assertArrayEquals(
                new String[] { "01*10" },
                displayMinefield(new String[] { "*.." })
        );
    }

    private String[] displayMinefield(String[] input) {
        return new MineField(input).displayMinefield();
    }
}
