package com.williamfiset.algorithms.datastructures.balancedtree;

import java.util.HashMap;
import java.util.Map;
public class CoverageTool_AVLTreeOptimized {
    private Map<Integer, Boolean> branchCoverage = new HashMap<>();

    public void initialize() {
        // insert branches
        branchCoverage.put(401, false);
        branchCoverage.put(402, false);
        branchCoverage.put(403, false);
        branchCoverage.put(404, false);
        branchCoverage.put(405, false);
        branchCoverage.put(406, false);
        // balance branches
        branchCoverage.put(407, false);
        branchCoverage.put(408, false);
        branchCoverage.put(409, false);
        branchCoverage.put(410, false);
        branchCoverage.put(411, false);
        branchCoverage.put(412, false);
    }

    public void markBranch(int branchId) {
        branchCoverage.put(branchId, true);
    }

    public void printCoverage() {
        System.out.println("Coverage Report:");
        for (Map.Entry<Integer, Boolean> entry : branchCoverage.entrySet()) {
            if (entry.getValue()) {
                System.out.println("Branch " + entry.getKey() + ": " + (entry.getValue() ? "Hit" : "Not Hit"));
            }
        }
    }
}
