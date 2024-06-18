package com.williamfiset.algorithms.dp;

import java.util.HashMap;
import java.util.Map;
public class BranchCoverageMaximumSubarray {
    public Map<String, Boolean> branchCoverage;


    public BranchCoverageMaximumSubarray() {
        branchCoverage = new HashMap<>();
        initializeCoverageMap();
    }


    private void initializeCoverageMap() {
        branchCoverage.put("Initialization", false);
        branchCoverage.put("StartNewSubarray", false);
        branchCoverage.put("ContinueCurrentSubarray", false);
        branchCoverage.put("UpdateMaxValue", false);
    }


    public void markAsCovered(String branchName) {
        if (branchCoverage.containsKey(branchName)) {
            branchCoverage.put(branchName, true);
        }
    }


    public void printCoverage() {
        System.out.println("\nBranch Coverage Report:");
        for (Map.Entry<String, Boolean> entry : branchCoverage.entrySet()) {
            System.out.println(entry.getKey() + ": " + (entry.getValue() ? "covered" : "not covered"));
        }
    }

}
