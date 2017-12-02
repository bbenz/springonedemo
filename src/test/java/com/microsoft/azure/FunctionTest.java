package com.microsoft.azure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Unit test for Function class.
 */
public class FunctionTest {
    /**
     * Unit test for sort method.
     */
    @Test
    public void testBubbleSort() throws Exception {
        // Setup
        final String input = "134,65,2,6,18,99";
        final String output = new Function().BubbleSort(input);

        assertEquals(output, "[2, 6, 18, 65, 99, 134]");

    }
}
