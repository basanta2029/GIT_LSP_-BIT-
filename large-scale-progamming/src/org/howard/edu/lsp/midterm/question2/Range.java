package org.howard.edu.lsp.midterm.question2;

/**
 * The Range interface defines the methods for working with a range of integers.
 */
public interface Range {
    /**
     * Checks if a given value is within the range.
     * 
     * @param value The integer value to check.
     * @return true if the value is within the range, false otherwise.
     */
    boolean contains(int value);

    /**
     * Checks if there is an overlap between this range and another range.
     * 
     * @param other The other range to check for overlap.
     * @return true if there is an overlap, false otherwise.
     */
    boolean overlaps(Range other);

    /**
     * Returns the number of integers in the range.
     * 
     * @return The size of the range.
     */
    int size();
}

