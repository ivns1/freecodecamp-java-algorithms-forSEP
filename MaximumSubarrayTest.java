package com.williamfiset.algorithms.dp;
import org.junit.Test;
import static org.junit.Assert.*;
public class MaximumSubarrayTest {
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
