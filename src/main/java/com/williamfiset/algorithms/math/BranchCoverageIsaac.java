package com.williamfiset.algorithms.math;

import java.util.HashMap;
import java.util.Map;

public class BranchCoverageIsaac {
    public Map<String, Boolean> branchCoverage;
    public BranchCoverageIsaac() {
        branchCoverage = new HashMap<>();
    }

    public void clearValuesIsPrime() {
        branchCoverage.clear();
        branchCoverage.put("301_IsPrime_1", false); // if branch for n < 2
        branchCoverage.put("302_IsPrime_2", false); // if branch for n == 2 || n == 3
        branchCoverage.put("303_IsPrime_3", false); // if branch for n % 2 == 0 || n % 3 == 0
        branchCoverage.put("304_IsPrime_4", false); // if branch in loop for n % i == 0 || n % (i + 2) == 0
        branchCoverage.put("305_IsPrime_5", false); // branch when all no if statements return true (basically else)
    }

    public void clearValuesModInverse() {
        branchCoverage.clear();
        branchCoverage.put("306_modInv_1", false);
        branchCoverage.put("307_modInv_2", false);
        branchCoverage.put("308_modInv_3", false);
    }

    public void wasCovered(String name) {
        branchCoverage.put(name, true);
    }

    public void printCoverage() {
        for (Map.Entry<String, Boolean> e : branchCoverage.entrySet()) {
            System.out.println(e.getKey() + " was covered? " + e.getValue());
        }
    }
}
