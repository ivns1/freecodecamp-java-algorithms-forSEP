package com.williamfiset.algorithms.isaac;
import com.williamfiset.algorithms.math.ModularInverse;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ModInverseTest {

    @Test
    public void testException() {
        int x = 1;
        int y = 0;
        assertThrows(ArithmeticException.class, () -> ModularInverse.modInv(x, y));
        System.out.println("\n\nmodInv_exception: \n");
        ModularInverse.branchCoverage.printCoverage();
    }

    @Test
    public void testNull() {
        int x = 4;
        int y = 18;
        assertThat(ModularInverse.modInv(x, y)).isEqualTo(null);
        System.out.println("\n\nmodInv_Null: \n");
        ModularInverse.branchCoverage.printCoverage();
    }

    @Test
    public void test_1_5__1() {
        int x = 1;
        int y = 5;
        assertThat(ModularInverse.modInv(x, y)).isEqualTo(1);
        System.out.println("\n\nmodInv_1_5__1: \n");
        ModularInverse.branchCoverage.printCoverage();
    }


}
