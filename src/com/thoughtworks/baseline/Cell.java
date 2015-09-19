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

    @Override
    public boolean equals(Object that) {
        Cell thatCell = (Cell) that;
        if (thatCell.hashCode() == this.hashCode())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) this.xLocation;
        hash = 31 * hash + (int) this.yLocation;
        hash = 31 * hash + (int) this.cellState.hashCode();
        return hash;
    }

    public int getXLocation() {
        return xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }
}
