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

    private String[] displayMinefield(String[] input) {
        String[] result = new String[input.length];
        for (int row = 0; row < input.length; row++) {
            String rowString = "";
            for (int col = 0; col < input[row].length(); col++) {
                rowString += "0";
            }
            result[row] = rowString;
        }
        return result;
    }
}
