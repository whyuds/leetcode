import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void topKFrequent1() {
        int[] nums = {1,1,1,2,2,3};
        List<Integer> expectResult = Arrays.asList(1,2);
        List<Integer> actualResult = TopKFrequentElements.topKFrequent(nums, 2);
        assertEquals(expectResult, actualResult);
    }

    @Test
    void topKFrequent2() {
        int[] nums = {1};
        List<Integer> expectResult = Arrays.asList(1);
        List<Integer> actualResult = TopKFrequentElements.topKFrequent(nums, 1);
        assertEquals(expectResult, actualResult);
    }

    @Test
    void topKFrequent3() {
        int[] nums = {3,3,3,3,3,3,3,2,1,3,5,6,8,7,4,2,1,2,3,4,5,5,5,5,5,5,1,1,1,2,2,2,3};
        List<Integer> expectResult = Arrays.asList(3,5,2);
        List<Integer> actualResult = TopKFrequentElements.topKFrequent(nums, 3);
        assertEquals(expectResult, actualResult);
    }
}