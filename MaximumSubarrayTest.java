package com.williamfiset.algorithms.dp;
import org.junit.Test;
import static org.junit.Assert.*;
public class MaximumSubarrayTest {

   @Test
   public void testMaximumSubarrayClassInitialization() {
        // Simply instantiate the MaximumSubarray class
        MaximumSubarray instance = new MaximumSubarray();
        assertNotNull(instance); // Assert that instantiation was successful
    }
    @Test
    public void testMainMethod() {
        // Simulate running the main method with specific inputs
        String[] args = new String[] { "-5", "-4", "-10", "-3", "-1", "-12", "-6" };
        MaximumSubarray.main(args);

    }
     @Test
        public void testMaximumSubarrayValue_EmptyArray() {
        int[] array = {};
        long result = MaximumSubarray.maximumSubarrayValue(array);
        assertEquals(0, result);
        MaximumSubarray.branchCoverage.printCoverage();
    }
        @Test
        public void testMaximumSubarrayValue_SingleElement() {
            int[] array = {-5};
            long result = MaximumSubarray.maximumSubarrayValue(array);
            assertEquals(-5, result);
            MaximumSubarray.branchCoverage.printCoverage();
        }

        @Test
        public void testMaximumSubarrayValue_NegativeNumbers() {
            int[] array = {-5, -4, -10, -3, -1, -12, -6};
            long result = MaximumSubarray.maximumSubarrayValue(array);
            assertEquals(-1, result);
            MaximumSubarray.branchCoverage.printCoverage();
        }

        @Test
        public void testMaximumSubarrayValue_MixedNumbers() {
            int[] array = {1, 2, 1, -7, 2, -1, 40, -89};
            long result = MaximumSubarray.maximumSubarrayValue(array);
            assertEquals(41, result);
            MaximumSubarray.branchCoverage.printCoverage();
        }


//
}
