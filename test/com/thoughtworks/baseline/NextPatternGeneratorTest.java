package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextPatternGeneratorTest {

    @Test
    public void shouldTakeTheInputBlockPatternAndReturnsOutputPattern() {
        NextPatternGenerator nextPatternGenerator = new NextPatternGenerator("XXXX");

        String outputPattern = nextPatternGenerator.generateOutputPattern();

        assertEquals("XXXX", outputPattern);
    }
}
