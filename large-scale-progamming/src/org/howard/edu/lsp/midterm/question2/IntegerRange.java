package org.howard.edu.lsp.midterm.question2;

/**
 * The IntegerRange class implements the Range interface and represents a range of integers.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange with the specified lower and upper bounds.
     * 
     * @param lowerBound The lower bound of the range.
     * @param upperBound The upper bound of the range.
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    @Override
    public boolean overlaps(Range other) {
        if (other instanceof IntegerRange) {
            IntegerRange otherRange = (IntegerRange) other;
            return this.lowerBound <= otherRange.upperBound && this.upperBound >= otherRange.lowerBound;
        }
        return false;
    }

    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IntegerRange) {
            IntegerRange other = (IntegerRange) obj;
            return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
        }
        return false;
    }
}

