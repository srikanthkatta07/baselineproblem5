//Should take the seed and computes every cell and returns output seed
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class SeedComputer {

    private ArrayList<Cell> seed;
    private ArrayList<Cell> outputSeed = new ArrayList<Cell>();

    public SeedComputer(ArrayList<Cell> seed) {
        this.seed = seed;
    }

    public ArrayList computeTheSeed() {
        for (Cell cell : seed) {
            computeEachCell(cell);
        }
        return seed;
    }

    private void computeEachCell(Cell cell) {
        if (cell.getCellState().equals("-")) {
            if (cell.getXLocation() == 0 & cell.getYLocation() == 0) {
                computeAdjacentCellWhenXAndYAreZero();
            }
        }
    }

    private void computeAdjacentCellWhenXAndYAreZero() {
        Cell[] neighbourCells = new Cell[3];
        neighbourCells[0] = seed.get(1);
        neighbourCells[1] = seed.get(3);
        neighbourCells[2] = seed.get(4);
        int numberOfNeighbourCells = 0;
        for (Cell neighbourCell : neighbourCells) {
            if ((neighbourCell.getCellState()).equals("live"))
                numberOfNeighbourCells++;
        }
        if (numberOfNeighbourCells == 3)
            outputSeed.add(new Cell(0, 0, "X"));
        else
            outputSeed.add(new Cell(0, 0, "-"));
    }
}
