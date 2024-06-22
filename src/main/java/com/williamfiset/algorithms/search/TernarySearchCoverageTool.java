package com.williamfiset.algorithms.search;

public class TernarySearchCoverageTool {

    // Coverage tracking for TernarySearch
    private static boolean branch101Hit = false;
    private static boolean branch102Hit = false;
    private static boolean branch103Hit = false;

    // Coverage tracking for TernarySearchDiscrete
    private static boolean branch104Hit = false;
    private static boolean branch105Hit = false;
    private static boolean branch106Hit = false;
    private static boolean branch107Hit = false;
    private static boolean branch108Hit = false;
    private static boolean branch109Hit = false;
    private static boolean branch110Hit = false;


    // Methods to track TernarySearch branches
    public static void trackBranch101Hit() {
        branch101Hit = true;
    }

    public static void trackBranch102Hit() {
        branch102Hit = true;
    }

    public static void trackBranch103Hit() {
        branch103Hit = true;
    }

    // Methods to track TernarySearchDiscrete branches
    public static void trackBranch104Hit() {
        branch104Hit = true;
    }

    public static void trackBranch105Hit() {
        branch105Hit = true;
    }

    public static void trackBranch106Hit() {
        branch106Hit = true;
    }

    public static void trackBranch107Hit() {
        branch107Hit = true;
    }

    public static void trackBranch108Hit() {
        branch108Hit = true;
    }

    public static void trackBranch109Hit() {
        branch109Hit = true;
    }

    public static void trackBranch110Hit() {
        branch110Hit = true;
    }


    // Method to print coverage
    public static void printCoverage() {
        System.out.println("Branch 101 was " + (branch101Hit ? "hit" : "not hit"));
        System.out.println("Branch 102 was " + (branch102Hit ? "hit" : "not hit"));
        System.out.println("Branch 103 was " + (branch103Hit ? "hit" : "not hit"));
        System.out.println("Branch 104 was " + (branch104Hit ? "hit" : "not hit"));
        System.out.println("Branch 105 was " + (branch105Hit ? "hit" : "not hit"));
        System.out.println("Branch 106 was " + (branch106Hit ? "hit" : "not hit"));
        System.out.println("Branch 107 was " + (branch107Hit ? "hit" : "not hit"));
        System.out.println("Branch 108 was " + (branch108Hit ? "hit" : "not hit"));
        System.out.println("Branch 109 was " + (branch109Hit ? "hit" : "not hit"));
        System.out.println("Branch 110 was " + (branch110Hit ? "hit" : "not hit"));
    }
}
