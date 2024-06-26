package com.williamfiset.algorithms.dp;

import java.util.HashMap;
import java.util.Map;
public class BranchCoverageLIS {
    public Map<Integer, Boolean> branchCoverage;

    public BranchCoverageLIS() {
        branchCoverage = new HashMap<>();
        initializeCoverageMap();
    }
//
    private void initializeCoverageMap() {
        branchCoverage.put(201, false); // array is null or empty
        branchCoverage.put(202, false); // first for loop entry
        branchCoverage.put(203, false); // second for loop entry
        branchCoverage.put(204, false); // ar[i] < ar[j]
        branchCoverage.put(205, false); // dp[j] < dp[i] + 1
        branchCoverage.put(206, false); // dp[i] > len
    }

    public void markAsCovered(int branchID) {
        if (branchCoverage.containsKey(branchID)) {
            branchCoverage.put(branchID, true);
        }
    }

    public void printCoverage() {
        System.out.println("\nBranch Coverage Report:");
        for (Map.Entry<Integer, Boolean> entry : branchCoverage.entrySet()) {
            String status = entry.getValue() ? "hit" : "not hit";
            System.out.println("branch ID " + entry.getKey() + ": " + status);
        }
    }
}
