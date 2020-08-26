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
                } else if (hasMine(row, col-1)) {
                    rowString += "1";
                } else if(hasMine(row, col+1)) {
                    rowString += "1";
                } else {
                    String hint = "0";
                    if (hasMine(row, col-1)) {
                        hint = "1";
                    }
                    if (hasMine(row, col+1)) {
                        hint = "1";
                    }
                    rowString += hint;
                }
            }
            result[row] = rowString;
        }
        return result;
    }

    private boolean hasMine(int row, int col) {
        if (col < 0 || input[row].length() <= col) {
            return false;
        }
        return input[row].charAt(col) == '*';
    }
}
