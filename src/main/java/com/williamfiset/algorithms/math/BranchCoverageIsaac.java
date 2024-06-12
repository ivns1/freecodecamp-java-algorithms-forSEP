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
        branchCoverage.put("IsPrime_1", false); // if branch for n < 2
        branchCoverage.put("IsPrime_2", false); // if branch for n == 2 || n == 3
        branchCoverage.put("IsPrime_3", false); // if branch for n % 2 == 0 || n % 3 == 0
        branchCoverage.put("IsPrime_4", false); // if branch in loop for n % i == 0 || n % (i + 2) == 0
        branchCoverage.put("IsPrime_5", false); // branch when all no if statements return true (basically else)
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
