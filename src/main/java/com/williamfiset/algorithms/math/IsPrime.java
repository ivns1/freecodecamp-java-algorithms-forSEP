/**
 * Tests whether a number is a prime number or not Time Complexity: O(sqrt(n))
 *
 * @author Micah Stairs, William Fiset
 */
package com.williamfiset.algorithms.math;

import jdk.internal.jimage.ImageStream;

import java.util.HashMap;
import java.util.Map;

public class IsPrime {
  public static BranchCoverageIsaac branchCoverage = new BranchCoverageIsaac();
  public static boolean isPrime(final long n) {
    branchCoverage.clearValuesIsPrime();
    if (n < 2) {

      branchCoverage.wasCovered("IsPrime_1");
      return false;
    }
    if (n == 2 || n == 3){
      branchCoverage.wasCovered("IsPrime_2");
      return true;
    }
    if (n % 2 == 0 || n % 3 == 0){
      branchCoverage.wasCovered("IsPrime_3");
      return false;
    }

    long limit = (long) Math.sqrt(n);

    for (long i = 5; i <= limit; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0) {
        branchCoverage.wasCovered("IsPrime_4");
        return false;
      }
    }
    branchCoverage.wasCovered("IsPrime_5");
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(5));
    System.out.println(isPrime(31));
    System.out.println(isPrime(1433));
    System.out.println(isPrime(8763857775536878331L));
  }
}
