/**
 * This file shows you how to find the length of the longest increasing subsequence length, using
 * dynamic programming. Time complexity: O(n^2)
 *
 * @author William Fiset, william.alexandre.fiset@gmail.com
 */
package com.williamfiset.algorithms.dp;

public class LongestIncreasingSubsequence {

  public static BranchCoverageLIS branchCoverage;

  public static void main(String[] args) {
    branchCoverage = new BranchCoverageLIS();

    System.out.println(lis(new int[] {1, 3, 2, 4, 3})); // 3
    System.out.println(lis(new int[] {2, 7, 4, 3, 8})); // 3
    System.out.println(lis(new int[] {5, 4, 3, 2, 1})); // 1
    System.out.println(lis(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})); // 9
  }

  // Finds the length of the longest increasing subsequence length, O(n^2)
  public static int lis(int[] ar) {

    if (ar == null || ar.length == 0) {
      branchCoverage.markAsCovered(201); //first branch
      return 0;
    }
    int n = ar.length, len = 0;

    // When starting, each individual element has a LIS
    // of exactly one, so each index is initialized to 1
    int[] dp = new int[n];
    java.util.Arrays.fill(dp, 1);

    // Processing the array left to right update the value of dp[j] if two
    // conditions hold 1) The value at i is less than that of the one at j
    // and 2) updating the value of dp[j] to dp[i]+1 is better
    for (int i = 0; i < n; i++) {
      branchCoverage.markAsCovered(202);
      for (int j = i + 1; j < n; j++) {
        branchCoverage.markAsCovered(203);
        if (ar[i] < ar[j])
        {  branchCoverage.markAsCovered(204);
          if(dp[j] < dp[i] + 1)
          {
            branchCoverage.markAsCovered(205);
            dp[j] = dp[i] + 1;
          }

        }
      }
      // Track the LIS
      if (dp[i] > len) {
        branchCoverage.markAsCovered(206);
        len = dp[i];
      }
    }

    return len;
  }
}
