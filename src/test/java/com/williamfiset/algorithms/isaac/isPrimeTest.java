package com.williamfiset.algorithms.isaac;
import com.williamfiset.algorithms.math.IsPrime;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class isPrimeTest {

    @Test
    public void testisPrime1() {
        int x = 1;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(false);
        System.out.println("testIsPrime1: \n");
        IsPrime.branchCoverage.printCoverage();
    }

    @Test
    public void testisPrime2() {
        int x = 3;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(true);
        System.out.println("\n\n testIsPrime2: \n");
        IsPrime.branchCoverage.printCoverage();
    }

    @Test
    public void testisPrime3() {
        int x = 12;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(false);
        System.out.println("\n\n testIsPrime3: \n");
        IsPrime.branchCoverage.printCoverage();
    }

    @Test
    public void testisPrime4() {
        int x = 25;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(false);
        System.out.println("\n\n testIsPrime4: \n");
        IsPrime.branchCoverage.printCoverage();
    }

    @Test
    public void testisPrime5() {
        int x = 7;
        boolean result = IsPrime.isPrime(x);
        assertThat(result).isEqualTo(true);
        System.out.println("\n\n testIsPrime5: \n");
        IsPrime.branchCoverage.printCoverage();
    }
}
