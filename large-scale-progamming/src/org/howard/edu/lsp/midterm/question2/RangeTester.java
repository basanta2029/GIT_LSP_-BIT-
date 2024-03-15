package org.howard.edu.lsp.midterm.question2;

/**
 * The RangeTester class is used to test the functionality of the IntegerRange class.
 */
public class RangeTester {
    public static void main(String[] args) {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        IntegerRange range3 = new IntegerRange(11, 20);

        System.out.println("Range1 contains 5: " + range1.contains(5)); // true
        System.out.println("Range1 overlaps Range2: " + range1.overlaps(range2)); // true
        System.out.println("Range1 overlaps Range3: " + range1.overlaps(range3)); // false
        System.out.println("Size of Range1: " + range1.size()); // 10
        System.out.println("Range1 equals Range2: " + range1.equals(range2)); // false
        System.out.println("Range2 equals Range3: " + range2.equals(range3)); // false
    }
}
