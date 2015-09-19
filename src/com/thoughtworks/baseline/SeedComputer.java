//Should take the seed and computes every cell and returns output seed
package com.thoughtworks.baseline;

import java.util.ArrayList;

public class SeedComputer {

    private ArrayList<Cell> seed;

    public SeedComputer(ArrayList<Cell> seed) {
        this.seed = seed;
    }

    public ArrayList computeTheSeed() {
        return seed;
    }
}
