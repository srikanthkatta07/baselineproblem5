package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void shouldGiveTheCellStateAsDeadWhenWeGiveTheMinusOperator() {
        Cell cell = new Cell(0, 0, "-");

        assertEquals("dead", cell.getCellState());
    }

    @Test
    public void shouldGiveTheCellStateAsLiveWhenWeGiveTheX() {
        Cell cell = new Cell(0, 0, "X");

        assertEquals("live", cell.getCellState());
    }

    @Test
    public void shouldEqualsToItSelf() {
        Cell cell = new Cell(0, 0, "X");

        assertEquals(cell, cell);
    }
}
