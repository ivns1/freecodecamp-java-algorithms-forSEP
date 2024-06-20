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
}
