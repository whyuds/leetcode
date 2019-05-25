import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum1() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSum(
                new int[]{1, 2}, 3
        ), new int[]{0, 1});
    }

    @Test
    void twoSum2() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSum(
                new int[]{1, 2, 3, 4, 6}, 6
        ), new int[]{1, 3});
    }

    @Test
    void twoSum3() {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(twoSum.twoSum(
                new int[]{6, 4, 8, 5, 123}, 12
        ), new int[]{1, 2});
    }
}