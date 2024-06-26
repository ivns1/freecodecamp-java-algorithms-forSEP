/**
 * This file shows you how to find the maximal subarray in an integer array Time complexity: O(n)
 *
 * @author William Fiset, william.alexandre.fiset@gmail.com
 */
package com.williamfiset.algorithms.dp;

public class MaximumSubarray {

  public static BranchCoverageMaximumSubarray branchCoverage = new BranchCoverageMaximumSubarray();


  public static void main(String[] args) {
    System.out.println(maximumSubarrayValue(new int[] {-5}));
    System.out.println(maximumSubarrayValue(new int[] {-5, -4, -10, -3, -1, -12, -6}));
    System.out.println(maximumSubarrayValue(new int[] {1, 2, 1, -7, 2, -1, 40, -89}));
  }

  // Return the value of the maximum subarray in 'ar'
  public static long maximumSubarrayValue(int[] ar) {

    if (ar == null || ar.length == 0) return 0L;
    int n = ar.length, maxValue, sum;

    maxValue = sum = ar[0];
    branchCoverage.markAsCovered(201);


    for (int i = 1; i < n; i++) {
      branchCoverage.markAsCovered(202); // For loop entry branch

      // At each step consider continuing the current subarray
      // or starting a new one because adding the next element
      // doesn't acutally make the subarray sum any better.
      if (ar[i] > sum + ar[i]) {
        sum = ar[i];
        branchCoverage.markAsCovered(203);
      }

      else {
        sum = sum + ar[i];
        branchCoverage.markAsCovered(204);
      }


      if (sum > maxValue) {
        branchCoverage.markAsCovered(205);
        maxValue = sum;
      }
    }

    return maxValue;
  }
}
