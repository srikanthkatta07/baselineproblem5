package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SeedComputerTest {

    @Test
    public void shouldComputesTheEachCellOfBlockPatternAndGeneratesTheOutputCells() {
        ArrayList<Cell> seed = new ArrayList<Cell>();
        Cell firstCell = new Cell(0, 0, "X");
        Cell secondCell = new Cell(0, 1, "X");
        Cell thirdCell = new Cell(1, 0, "X");
        Cell fourthCell = new Cell(1, 1, "X");

        seed.add(firstCell);
        seed.add(secondCell);
        seed.add(thirdCell);
        seed.add(fourthCell);

        SeedComputer seedComputer = new SeedComputer(seed);

        assertEquals(seed, seedComputer.computeTheSeed());
    }

    @Test
    public void shouldComputesTheEachCellOfBoatPatternAndGeneratesTheOutputCells() {
        ArrayList<Cell> seed = new ArrayList<Cell>();
        Cell firstCell = new Cell(0, 0, "X");
        Cell secondCell = new Cell(0, 1, "X");
        Cell thirdCell = new Cell(0, 2, "-");
        Cell fourthCell = new Cell(1, 0, "X");
        Cell fifthCell = new Cell(1, 1, "-");
        Cell sixthCell = new Cell(1, 2, "X");
        Cell seventhCell = new Cell(2, 0, "-");
        Cell eightCell = new Cell(2, 1, "X");
        Cell ninthCell = new Cell(2, 2, "-");

        seed.add(firstCell);
        seed.add(secondCell);
        seed.add(thirdCell);
        seed.add(fourthCell);
        seed.add(fifthCell);
        seed.add(sixthCell);
        seed.add(seventhCell);
        seed.add(eightCell);
        seed.add(ninthCell);

        SeedComputer seedComputer = new SeedComputer(seed);

        assertEquals(seed, seedComputer.computeTheSeed());
    }

    @Test
    public void shouldComputesTheEachCellOfBlinkPatternAndGeneratesTheOutputCells() {
        ArrayList<Cell> inputSeed = new ArrayList<Cell>();
        Cell firstCell = new Cell(0, 0, "-");
        Cell secondCell = new Cell(0, 1, "X");
        Cell thirdCell = new Cell(0, 2, "-");
        Cell fourthCell = new Cell(1, 0, "-");
        Cell fifthCell = new Cell(1, 1, "X");
        Cell sixthCell = new Cell(1, 2, "-");
        Cell seventhCell = new Cell(2, 0, "-");
        Cell eightCell = new Cell(2, 1, "X");
        Cell ninthCell = new Cell(2, 2, "-");

        inputSeed.add(firstCell);
        inputSeed.add(secondCell);
        inputSeed.add(thirdCell);
        inputSeed.add(fourthCell);
        inputSeed.add(fifthCell);
        inputSeed.add(sixthCell);
        inputSeed.add(seventhCell);
        inputSeed.add(eightCell);
        inputSeed.add(ninthCell);

        ArrayList<Cell> outputSeed = new ArrayList<Cell>();
        Cell cell1 = new Cell(0, 0, "-");
        Cell cell2 = new Cell(0, 1, "-");
        Cell cell3 = new Cell(0, 2, "-");
        Cell cell4 = new Cell(1, 0, "X");
        Cell cell5 = new Cell(1, 1, "X");
        Cell cell6 = new Cell(1, 2, "X");
        Cell cell7 = new Cell(2, 0, "-");
        Cell cell8 = new Cell(2, 1, "-");
        Cell cell9 = new Cell(2, 2, "-");

        outputSeed.add(cell1);
        outputSeed.add(cell2);
        outputSeed.add(cell3);
        outputSeed.add(cell4);
        outputSeed.add(cell5);
        outputSeed.add(cell6);
        outputSeed.add(cell7);
        outputSeed.add(cell8);
        outputSeed.add(cell9);



        SeedComputer seedComputer = new SeedComputer(inputSeed);

        assertEquals(inputSeed, seedComputer.computeTheSeed());
    }
}
