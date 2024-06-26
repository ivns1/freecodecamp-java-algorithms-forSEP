package com.williamfiset.algorithms.datastructures.balancedtree;

import static com.google.common.truth.Truth.assertThat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AVLTreeOptimizedTest {

    private CoverageTool_AVLTreeOptimized coverageTracker;
    private AVLTreeRecursiveOptimized<Integer> tree;

    @Before
    public void setup() {
        coverageTracker = new CoverageTool_AVLTreeOptimized();
        tree = new AVLTreeRecursiveOptimized<>(coverageTracker);
    }

    @Test
    public void insertTest() {
        boolean result = tree.insert(10);
        assertThat(result).isTrue();

        result = tree.insert(10);
        assertThat(result).isFalse();

        tree.insert(5);
        assertThat(tree.contains(5)).isTrue();
        tree.insert(15);
        assertThat(tree.contains(15)).isTrue();
        tree.insert(3);
        assertThat(tree.contains(3)).isTrue();
        tree.insert(7);
        assertThat(tree.contains(7)).isTrue();
        tree.insert(12);
        assertThat(tree.contains(12)).isTrue();
        tree.insert(17);
        assertThat(tree.contains(17)).isTrue();

        result = tree.insert(12);
        assertThat(result).isFalse();

        result = tree.insert(null);
        assertThat(result).isFalse();
    }

    @Test
    public void testBalanceLeftLeftCase() {
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        assertThat(tree.root.value).isEqualTo(2);
    }

    @Test
    public void testBalanceLeftRightCase() {
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        assertThat(tree.root.value).isEqualTo(2);
    }

    @Test
    public void testBalanceRightRightCase() {
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertThat(tree.root.value).isEqualTo(2);
    }

    @Test
    public void testBalanceRightLeftCase() {
        tree.insert(1);
        tree.insert(3);
        tree.insert(2);
        assertThat(tree.root.value).isEqualTo(2);
    }

    @After
    public void printCoverage() {
        coverageTracker.printCoverage();
    }
}


