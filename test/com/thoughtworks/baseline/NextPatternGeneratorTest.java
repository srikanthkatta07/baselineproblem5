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

    @Test
    public void shouldTakeTheInputBoatPatternAndReturnsOutputPattern() {
        NextPatternGenerator nextPatternGenerator = new NextPatternGenerator("XX-X-X-X-");

        String outputPattern = nextPatternGenerator.generateOutputPattern();

        assertEquals("XX-X-X-X-", outputPattern);
    }

    @Test
    public void shouldTakeTheInputBlinkPatternAndReturnsOutputPattern() {
        NextPatternGenerator nextPatternGenerator = new NextPatternGenerator("-X--X--X-");

        String outputPattern = nextPatternGenerator.generateOutputPattern();
    }
}
