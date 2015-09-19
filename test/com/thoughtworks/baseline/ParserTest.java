package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldTakeTheInputBlockPatternFromTheGeneratorAndReturnsTheListOfCells() {
        Parser parser = new Parser("XXXX",2,2);
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
}
