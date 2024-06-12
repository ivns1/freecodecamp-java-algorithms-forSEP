package com.williamfiset.algorithms.isaac;
import com.williamfiset.algorithms.math.IsPrime;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class isPrimeTest {

    @Test
    public void isPrime_1_false() {
        int x = 1;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(false);
        System.out.println("\n\nisPrime_1_false: \n");
        IsPrime.branchCoverage.printCoverage();
    }

    @Test
    public void isPrime_2_true() {
        int x = 3;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(true);
        System.out.println("\n\n isPrime_2_true: \n");
        IsPrime.branchCoverage.printCoverage();
    }

    @Test
    public void isPrime_12_false() {
        int x = 12;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(false);
        System.out.println("\n\n isPrime_12_false: \n");
        IsPrime.branchCoverage.printCoverage();
    }

    @Test
    public void isPrime_25_false() {
        int x = 25;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(false);
        System.out.println("\n\n isPrime_25_false: \n");
        IsPrime.branchCoverage.printCoverage();
    }

    @Test
    public void isPrime_7_true() {
        int x = 7;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(true);
        System.out.println("\n\n isPrime_7_true: \n");
        IsPrime.branchCoverage.printCoverage();
    }
}
