package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldTakeTheInputBlockPatternFromTheGeneratorAndReturnsTheListOfCells() {
        Parser parser = new Parser("XXXX",2,2);
        ArrayList<Cell> cells = new ArrayList<Cell>();
        Cell firstCell = new Cell(0, 0, "X");
        Cell secondCell = new Cell(0, 1, "X");
        Cell thirdCell = new Cell(1, 0, "X");
        Cell fourthCell = new Cell(1, 1, "X");

        cells.add(firstCell);
        cells.add(secondCell);
        cells.add(thirdCell);
        cells.add(fourthCell);

        assertEquals(cells, parser.parseInputPattern());
    }
}
