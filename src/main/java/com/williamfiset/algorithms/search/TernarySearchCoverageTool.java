package com.williamfiset.algorithms.search;

public class TernarySearchCoverageTool {

    // Coverage tracking
    private static boolean branch1Hit = false;
    private static boolean branch2Hit = false;
    private static boolean loopBreakHit = false;

    public static void trackBranch1Hit() {
        branch1Hit = true;
    }

    public static void trackBranch2Hit() {
        branch2Hit = true;
    }

    public static void trackLoopBreakHit() {
        loopBreakHit = true;
    }

    public static void printCoverage() {
        System.out.println("Branch 1 (res1 > res2) was " + (branch1Hit ? "hit" : "not hit"));
        System.out.println("Branch 2 (res1 <= res2) was " + (branch2Hit ? "hit" : "not hit"));
        System.out.println("Loop break was " + (loopBreakHit ? "hit" : "not hit"));
    }
}
