//Which takes input pattern and returns output pattern
package com.thoughtworks.baseline;

public class NextPatternGenerator {

    private String inputPattern;

    public NextPatternGenerator(String inputPattern) {
        this.inputPattern = inputPattern;

    }

    public String generateOutputPattern() {
        return inputPattern;
    }
}
