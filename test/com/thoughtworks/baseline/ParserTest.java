package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldTakeTheInputBlockPatternFromTheGeneratorAndReturnsTheListOfCells() {
        Parser parser = new Parser("XXXX", 2, 2);
        ArrayList<Cell> seed = new ArrayList<Cell>();
        Cell firstCell = new Cell(0, 0, "X");
        Cell secondCell = new Cell(0, 1, "X");
        Cell thirdCell = new Cell(1, 0, "X");
        Cell fourthCell = new Cell(1, 1, "X");

        seed.add(firstCell);
        seed.add(secondCell);
        seed.add(thirdCell);
        seed.add(fourthCell);

        assertEquals(seed, parser.parseInputPattern());
    }

    @Test
    public void shouldTakeTheInputBoatPatternFromTheGeneratorAndReturnsTheListOfCells() {
        Parser parser = new Parser("XX-X-X-X-", 3, 3);
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

        assertEquals(seed, parser.parseInputPattern());
    }
}
