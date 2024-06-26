package com.williamfiset.algorithms.search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.function.DoubleFunction;

public class TernarySearchTest {

    @Test
    public void testTernarySearch() {
        DoubleFunction<Double> function = (x) -> (x * x + 3 * x + 5);

        double result = TernarySearch.ternarySearch(-100.0, +100.0, function);

        double expectedResult = -1.5;

        double epsilon = 0.0001;

        assertEquals(expectedResult, result, epsilon);

        TernarySearchCoverageTool.printCoverage();
    }

    @Test
    public void testTernarySearchDiscrete() {
        int lo = 0;
        int hi = TernarySearchDiscrete.function.length - 1;

        double result = TernarySearchDiscrete.discreteTernarySearch(lo, hi);

        double expectedResult = 3.0;

        double epsilon = 0.0001;

        assertEquals(expectedResult, TernarySearchDiscrete.f((int) result), epsilon);

        TernarySearchCoverageTool.printCoverage();
    }

    @Test
    public void testTernarySearchDiscreteWithSmallRange() {
        int lo = 0;
        int hi = 1;

        double result = TernarySearchDiscrete.discreteTernarySearch(lo, hi);

        double expectedResult = Math.min(TernarySearchDiscrete.f(lo), TernarySearchDiscrete.f(hi));

        double epsilon = 0.0001;

        assertEquals(expectedResult, TernarySearchDiscrete.f((int) result), epsilon);

        TernarySearchCoverageTool.printCoverage();
    }

    @Test
    public void testTernarySearchDiscreteWithReturnLo() {
        int lo = 5;
        int hi = 5;

        double result = TernarySearchDiscrete.discreteTernarySearch(lo, hi);

        double expectedResult = lo;

        assertEquals(expectedResult, TernarySearchDiscrete.f((int) result), 0.0); // Exact comparison since result should be integer

        TernarySearchCoverageTool.printCoverage();
    }

}
