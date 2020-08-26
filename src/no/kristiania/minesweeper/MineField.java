package no.kristiania.minesweeper;

public class MineField {
    private String[] input;

    public MineField(String[] input) {
        this.input = input;
    }

    public String[] displayMinefield() {
        String[] result = new String[input.length];
        for (int row = 0; row < input.length; row++) {
            String rowString = "";
            for (int col = 0; col < input[row].length(); col++) {
                if (hasMine(row, col)) {
                    rowString += "*";
                } else {
                    rowString += "0";
                }
            }
            result[row] = rowString;
        }
        return result;
    }

    private boolean hasMine(int row, int col) {
        return input[row].charAt(col) == '*';
    }
}
