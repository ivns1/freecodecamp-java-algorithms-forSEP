package com.williamfiset.algorithms.search;

public class TernarySearchCoverageTool {

    // Coverage tracking
    private static boolean branch101Hit = false;
    private static boolean branch102Hit = false;
    private static boolean branch103Hit = false;

    public static void trackBranch101Hit() {
        branch101Hit = true;
    }

    public static void trackBranch102Hit() {
        branch102Hit = true;
    }

    public static void trackBranch103Hit() {
        branch103Hit = true;
    }

    public static void printCoverage() {
        System.out.println("Branch 101 was " + (branch101Hit ? "hit" : "not hit"));
        System.out.println("Branch 102 was " + (branch102Hit ? "hit" : "not hit"));
        System.out.println("Branch 103 was " + (branch103Hit? "hit" : "not hit"));
    }
}
