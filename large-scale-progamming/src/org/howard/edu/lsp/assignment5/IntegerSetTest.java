package org.howard.edu.lsp.assignment5;

import org.junit.Test;

public class IntegerSetTest {

    // Other test methods...

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.complement(set2);
        IntegerSet expected = new IntegerSet();
        expected.add(3);
        assertTrue(set1.equals(expected));
    }

	private void assertTrue(boolean equals) {
		// TODO Auto-generated method stub
		
	}

    // Other test methods...
}
