//Which creates the cell model and returns the state of cell
package com.thoughtworks.baseline;

public class Cell {

    private int yLocation;
    private int xLocation;
    private String cellState;

    public Cell(int xLocation, int yLocation, String cellState) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.cellState = cellState;

    }

    public String getCellState() {
        if (cellState.equals("-"))
            return "dead";
        return "live";
    }
}
