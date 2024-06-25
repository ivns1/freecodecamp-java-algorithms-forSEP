package com.williamfiset.algorithms.dp;
import org.junit.Test;
import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {
   @Test
    public void testLis_EmptyArray() {
        LongestIncreasingSubsequence.branchCoverage = new BranchCoverageLIS();
        int[] array = {};
        int result = LongestIncreasingSubsequence.lis(array);
        assertEquals(0, result);
        LongestIncreasingSubsequence.branchCoverage.printCoverage();
    }

    @Test
    public void testLis_DecreasingSequence() {
        LongestIncreasingSubsequence.branchCoverage = new BranchCoverageLIS();
        int[] array = {5, 4, 3, 2, 1};
        int result = LongestIncreasingSubsequence.lis(array);
        assertEquals(1, result);
        LongestIncreasingSubsequence.branchCoverage.printCoverage();
    }

    @Test
    public void testLis_IncreasingSequence() {
        LongestIncreasingSubsequence.branchCoverage = new BranchCoverageLIS();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = LongestIncreasingSubsequence.lis(array);
        assertEquals(9, result);
        LongestIncreasingSubsequence.branchCoverage.printCoverage();
    }

    @Test
    public void testLis_MixedSequence() {
        LongestIncreasingSubsequence.branchCoverage = new BranchCoverageLIS();
        int[] array = {2, 7, 4, 3, 8};
        int result = LongestIncreasingSubsequence.lis(array);
        assertEquals(3, result);
        LongestIncreasingSubsequence.branchCoverage.printCoverage();
    }

}
