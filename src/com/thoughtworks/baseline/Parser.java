//Take the input pattern and returns the cell objects
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class Parser {

    private int rows;
    private int columns;
    private String inputPattern;
    private ArrayList<Cell> seed = new ArrayList<Cell>();

    public Parser(String inputPattern, int rows, int columns) {
        this.inputPattern = inputPattern;
        this.rows = rows;
        this.columns = columns;
    }

    public ArrayList parseInputPattern() {
        int patternIndex = 0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                Cell cell = new Cell(row, column, "" + inputPattern.charAt(patternIndex));
                seed.add(cell);
                patternIndex++;
            }
        }
        return seed;
    }
}
