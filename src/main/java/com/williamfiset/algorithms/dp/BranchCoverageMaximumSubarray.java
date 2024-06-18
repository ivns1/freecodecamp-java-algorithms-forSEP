package com.williamfiset.algorithms.dp;

import java.util.HashMap;
import java.util.Map;
public class BranchCoverageMaximumSubarray {
    public Map<Integer, Boolean> branchCoverage;


    public BranchCoverageMaximumSubarray() {
        branchCoverage = new HashMap<>();
        initializeCoverageMap();
    }


    private void initializeCoverageMap() {
        branchCoverage.put(201, false); //initialized
        branchCoverage.put(202, false); // start new subarray
        branchCoverage.put(203, false); //continue new subarray
        branchCoverage.put(204, false); //update max value
        branchCoverage.put(205, false);
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
            System.out.println("branch ID " + entry.getKey() + ", " + status);
        }
    }

}
