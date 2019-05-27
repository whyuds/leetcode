import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class DistantBarcodesTest {

    @Test
    public void rearrangeBarcodes() {
        int[] input = new int[]{1, 1, 1, 1, 2, 2, 3, 3};
        int[] result = DistantBarcodes.rearrangeBarcodes(input);
        assertArray(result, input);
    }

    @Test
    public void rearrangeBarcodes1() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = DistantBarcodes.rearrangeBarcodes(input);
        assertArray(result, input);
    }

    @Test
    public void rearrangeBarcodes3() {
        int[] input = new int[]{1, 1, 1, 2, 2, 2};
        int[] result = DistantBarcodes.rearrangeBarcodes(input);
        assertArray(result, input);
    }

    @Test
    public void rearrangeBarcodes4() {
        int[] input = new int[]{2, 1, 1};
        int[] result = DistantBarcodes.rearrangeBarcodes(input);
        assertArray(result, input);
    }

    @Test
    public void rearrangeBarcodes5() {
        int[] input = new int[]{4,9,9,9,9,4,6,9,6,4};
        int[] result = DistantBarcodes.rearrangeBarcodes(input);
        assertArray(result, input);
    }

    @Test
    public void rearrangeBarcodes6() {
        int[] input = new int[]{2,2,1,1,1,2,2,2,1,1,2,2,2,1,1,1,1,2,2,2,1,1,2,2,1,1,2,2,2,1,2,2,1,1,2,2,2,2,2,2,1,2,1,2,2,2,1,2,2,1,2,2,1,1,1,2,2,1,1,2,1,1,1,1,2,2,2,2,1,2,2,2,1,1,2,2,2,1,2,1,2,1,1,2,1,2,1,2,1,1,2,1,1,2,2,1,2,1,1,2,2,2,2,2,1,2,1,1,2,2,2,1,1,2,1,2,1,2,2,2,2,1,1,1,1,1,2,1,1,1,2,1,1,1,1,1,1,1,1,2,1,1,1,2,1,1,2,1,2,2,1,1,2,1,2,1,2,1,1,2,1,1,2,1,2,1,2,2,1,2,1,1,1,1,2,2,1,2,2,1,2,1,1,2,2,2,1,2,2,1,1,1,1,2,2,1,1,2,2,1,1,1,1,1,1,2,2,2,1,2,1,1,2,1,1,1,2,2,1,1,2,2,1,2,2,2,1,2,1,2,1,2,1,1,2,2,1,2,2,2,1,1,1,2,1,2,1,1,2,1,1,2,2,2,2,2,2,1,1,1,2,1,2,2,1,2,2,2,1,2,1,1,2,2,2,2,1,2,2,1,1,1,2,1,1,2,2,2,1,2,2,1,1,2,2,1,2,2,2,1,2,1,1,2,1,2,2,1,1,1,2,1,2,1,1,2,1,1,1,1,1,2,2,2,2,2,1,1,2,1,2,2,2,2,1,1,1,1,2,1,2,1,1,1,1,2,1,1,2,1,1,2,2,2,2,1,2,1,1,1,2,2,2,1,2,1,1,2,2,2,2,2,1,2,2,1,2,2,2,1,2,2,2,2,2,1,1,2,2,2,1,2,1,1,2,1,2,2,2,1,1,1,2,2,2,1,1,1,2,2,1,2,1,2,1,1,1,1,1,2,2,1,1,2,2,1,1,2,1,1,1,2,2,1,2,2,1,1,1,2,2,2,2,2,1,1,1,2,1,1,2,2,2,1,1,1,1,1,2,2,1,1,1,2,1,1,2,2,1,1,1,2,1,2,1,2,1,2,2,2,1,2,1,2,2,2,1,2,2,2,1,1,1,1,1,2,1,2,1,2,2,1,1,1,2,2,2,1,1,1,1,1,2,1,2,1,2,2,2,1,1,1,1,1,2,2,1,2,1,1,2,2,1,1,2,1,1,1,2,1,2,2,2,1,1,1,2,2,1,2,2,1,1,1,1,1,2,1,2,1,2,1,1,2,2,2,1,2,1,1,2,2,1,1,2,2,1,2,1,1,1,2,2,1,1,1,2,2,1,2,1,2,1,1,2,1,2,1,1,1,1,2,2,1,1,1,2,1,2,1,1,2,2,1,2,1,1,1,1,1,1,1,2,1,2,1,1,1,2,1,1,2,2,1,2,1,2,1,2,2,2,2,2,1,1,2,1,2,2,1,1,2,1,2,2,2,1,2,2,1,1,1,1,1,2,2,2,1,1,2,2,1,2,2,1,1,1,2,2,2,1,2,1,2,1,1,2,1,2,1,2,1,2,2,2,2,2,2,2,1,1,2,1,2,2,2,1,2,2,1,1,2,1,2,2,2,2,2,1,2,2,1,2,2,1,1,1,2,2,1,2,1,2,1,2,1,1,2,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,2,2,2,2,2,2,1,2,1,2,1,2,1,1,2,2,2,1,1,2,1,1,2,1,1,1,1,2,2,2,1,2,1,1,2,1,2,2,2,1,2,2,2,2,2,1,1,2,2,1,2,1,1,2,1,1,1,1,2,1,2,1,2,2,2,2,1,1,2,1,2,2,1,2,2,2,2,2,2,1,2,1,1,2,2,1,1,1,2,1,1,2,1,2,1,1,2,2,1,1,2,1,2,1,2,1,2,2,1,2,2,1,2,2,1,2,2,2,2,1,1,1,1,2,1,2,1,1,1,2,1,2,2,1,1,2,2,1,2,2,1,1,2,1,1,1,1,1,1,2,2,1,1,2,2,1,1,1,1,2,1,1,2,2,2,2,1,1,1,2,1,2,1,2,2,1,2,1,1,1,1,2,2,2,2,2,2,1,1,2,1,2,1,2,2,2,2,2,2,1,2,1,2,2,1,2,2,1,1,2,2,2,1,1,2,2,1,1,2,2,2,1,2,1,1,2,1,1,2,1,1,2,2,2,1,2,1,1,1,1,1,2,2,2,2,2,2,2,1,1,2,2,1,1,1,2,2,2,2,2,2,2,2,1,2,2,2,2,2,2,2,1,2,1,1,2,2,2,1,2,1,2,2,2,2,2,2,2,2,2,1,2,1,1,1,1,1,1,2,1,2,1,2,2,1,2,1,2,2,2,1,1,2,2,2,2,2,2,2,2,1,1,1,2,2,2,2,2,1,2,1,1,2,1,1,2,2,2,2,1,1,2,1,2,1,1,1,2,1,1,1,2,2,2,2,2,1,2,2,1,2,2,1,1,1,1,2,1,1,1,1,2,1,1,2,2,2,2,1,2,2,1,2,1,1,2,1,1,1,2,2,2,1,2,2,1,1,1,1,1,2,1,2,1,1,2,2,2,1,2,2,2,2,1,1,1,1,1,1,1,2,1,2,1,1,2,2,1,2,2,1,1,1,2,2,2,1,2,1,2,2,2,1,1,1,1,1,2,1,1,2,1,2,1,1,2,2,1,1,2,2,1,1,1,1,1,2,2,1,1,2,1,1,2,1,2,1,1,2,2,2,2,2,2,1,1,2,1,2,1,1,1,2,2,1,1,2,2,1,2,1,2,1,1,1,2,1,2,2,1,1,2,1,1,1,2,2,1,2,2,2,2,1,2,1,2,1,1,1,2,1,2,1,1,1,1,1,1,2,2,1,1,2,1,1,2,2,2,1,1,2,1,1,1,2,1,1,1,1,1,2,2,1,2,2,1,2,1,2,2,1,2,2,2,2,2,1,2,2,2,2,2,1,1,1,2,2,1,1,2,1,1,2,1,1,1,1,1,1,2,2,2,2,1,2,2,2,2,1,2,2,1,2,2,2,1,1,2,1,2,2,2,1,1,2,1,1,2,2,2,2,1,1,1,1,2,2,1,2,1,2,2,1,1,2,2,2,1,2,2,2,1,2,2,2,1,1,1,1,2,2,1,2,1,2,1,1,2,1,1,1,1,2,1,1,2,1,2,1,2,2,1,2,2,2,1,2,1,2,1,1,1,2,2,2,1,2,1,1,1,1,2,2,2,2,2,2,1,2,2,2,2,2,2,1,1,1,2,2,2,1,1,2,1,2,2,1,1,2,2,1,1,2,1,2,1,1,1,1,1,2,2,1,1,1,2,2,2,2,1,2,1,1,1,2,1,2,1,2,1,2,2,1,1,1,2,1,1,2,1,2,2,2,1,1,2,1,2,1,2,1,1,2,1,2,1,2,2,2,1,1,2,1,2,2,1,1,2,1,1,2,2,1,2,1,1,2,1,1,2,1,2,1,2,1,1,2,1,1,2,1,2,1,2,2,1,1,2,2,2,1,2,1,1,1,1,1,1,2,2,1,2,1,2,1,2,1,1,2,1,1,1,1,2,1,2,2,2,1,2,1,1,2,2,1,2,1,1,1,1,2,2,2,2,2,2,1,2,1,1,2,2,2,2,2,1,1,1,1,2,1,1,2,2,2,1,1,2,2,1,2,2,2,1,2,1,2,1,1,2,1,2,2,2,1,1,2,1,1,1,1,2,1,1,1,2,2,1,2,2,1,1,2,2,2,1,1,1,2,1,2,1,2,2,1,2,1,1,2,2,2,1,1,2,1,1,2,1,1,1,2,2,1,2,1,1,2,2,1,1,2,2,1,1,1,2,1,1,1,2,2,1,2,2,1,1,2,1,2,2,1,1,2,2,1,1,2,1,1,1,2,2,1,1,2,1,2,1,2,1,1,1,1,2,1,1,2,2,1,2,2,2,2,1,2,1,2,1,1,2,2,1,1,1,2,2,1,2,2,1,2,1,1,2,2,1,2,1,2,2,1,1,2,2,1,1,2,2,2,1,2,1,2,2,2,2,1,2,1,1,2,2,2,2,1,1,2,2,1,2,2,2,1,1,1,1,2,2,1,2,1,1,1,1,1,2,2,1,1,2,2,2,1,1,1,1,1,1,2,2,2,2,2,1,1,2,2,1,1,2,2,2,1,2,2,1,1,1,2,1,2,1,1,1,2,1,2,2,1,2,2,2,1,2,1,2,2,2,2,1,1,2,2,1,1,2,1,2,1,2,2,2,1,2,2,1,2,2,1,2,2,1,1,1,2,2,2,2,1,2,2,2,2,2,2,1,2,2,1,2,1,1,1,2,1,2,2,2,2,2,1,2,2,1,1,2,1,2,2,1,1,2,2,2,1,2,1,1,1,2,1,2,1,2,2,2,1,1,2,1,1,1,1,1,2,2,1,1,2,2,2,2,1,2,2,1,2,1,1,1,2,2,2,2,1,2,2,1,1,1,1,1,2,1,2,1,2,2,2,2,1,1,1,1,1,2,1,2,1,1,2,1,2,2,1,2,1,1,1,2,2,2,2,2,2,1,2,1,1,2,1,1,2,1,2,2,2,2,1,1,1,1,2,1,1,1,1,2,2,1,1,1,1,1,1,1,2,1,2,1,2,2,1,2,2,2,1,1,2,1,1,1,1,2,2,1,2,2,2,2,2,2,2,1,2,1,1,1,2,2,1,1,1,1,1,1,1,1,2,1,2,1,1,2,2,2,1,1,2,1,1,2,1,1,1,2,1,2,1,2,2,1,1,1,1,1,1,2,2,2,2,2,1,2,1,2,1,1,1,2,1,1,1,1,2,2,1,2,1,2,1,1,1,1,2,1,2,2,2,2,1,2,2,1,1,2,2,2,1,2,2,1,2,1,2,2,1,1,1,1,2,2,1,1,1,1,2,1,1,2,1,1,2,1,1,1,2,2,2,1,2,2,1,2,2,1,1,2,2,2,2,2,1,2,1,1,2,2,2,2,2,2,1,2,2,2,2,2,1,1,2,1,1,1,1,1,2,2,2,1,2,2,2,1,2,1,1,1,1,2,2,2,2,1,1,2,2,2,1,2,2,1,1,2,1,2,1,2,1,1,2,1,1,2,1,2,1,2,1,2,2,2,2,1,2,2,2,1,1,1,2,1,1,2,2,1,1,1,2,1,2,1,1,2,2,2,2,2,2,2,2,2,1,1,2,1,1,1,2,2,1,1,2,1,2,1,2,2,2,2,1,1,2,2,1,2,1,2,1,2,2,1,2,1,2,1,1,1,1,1,2,2,2,2,2,2,1,1,2,2,1,1,2,1,2,1,1,1,2,1,1,1,1,2,2,2,1,2,1,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,1,2,2,1,2,2,1,1,2,1,2,1,1,1,2,1,2,1,2,2,1,1,1,2,1,1,1,1,1,2,2,1,1,2,1,2,2,2,1,1,1,2,1,1,1,1,1,1,2,1,1,1,2,2,1,1,1,2,2,1,2,2,1,2,2,1,1,1,2,2,1,2,2,2,2,2,2,1,1,1,1,1,2,2,1,1,2,2,1,1,2,1,2,2,1,2,2,1,1,2,1,2,1,2,1,1,1,2,1,2,1,1,2,2,2,2,2,1,1,2,1,1,1,1,1,1,2,2,1,2,2,2,1,2,1,2,1,2,1,1,1,1,1,1,2,2,1,2,2,1,1,1,1,1,1,1,2,1,1,2,1,2,2,1,2,1,2,1,1,1,1,2,2,2,2,1,2,1,2,2,1,1,1,1,1,1,2,2,2,2,1,1,1,1,1,1,1,1,2,2,2,1,2,1,2,1,1,1,1,2,1,1,2,2,2,2,2,1,1,1,2,1,1,1,1,1,1,1,2,2,1,2,2,1,2,1,1,1,2,1,1,1,1,2,2,2,1,2,2,2,1,2,2,2,2,1,2,2,1,1,2,1,1,2,2,1,1,2,1,2,1,1,2,1,1,2,1,1,2,2,2,2,1,2,1,1,2,2,1,1,1,2,1,2,2,2,1,2,2,1,2,1,1,1,2,2,1,2,1,1,1,2,1,1,1,2,1,1,2,1,1,2,2,1,1,2,1,1,2,1,2,2,2,2,1,1,1,2,1,2,1,1,2,1,2,1,2,2,2,2,1,1,2,2,2,1,2,1,1,1,2,2,2,1,2,1,1,1,1,2,1,2,1,1,1,1,2,1,2,2,2,1,1,2,2,1,2,1,2,2,2,2,2,2,2,1,1,1,2,2,1,2,2,1,1,1,1,1,2,2,2,1,2,2,2,2,2,2,1,1,1,1,2,1,2,2,1,1,2,1,1,1,2,1,2,1,2,1,1,1,1,2,2,1,1,2,2,2,2,1,2,2,1,2,1,2,1,1,2,2,1,2,2,2,2,1,2,2,2,2,2,1,1,2,2,2,2,1,2,2,2,1,2,2,2,1,2,1,2,2,2,1,2,2,2,2,1,2,2,1,1,1,2,1,1,2,1,2,1,2,2,1,1,2,2,1,1,1,2,2,1,1,1,2,1,2,2,1,1,1,2,2,2,1,1,1,2,1,1,1,2,2,1,1,2,1,2,1,2,2,1,1,2,1,2,1,2,2,2,2,2,1,1,1,2,2,2,2,1,1,1,1,2,2,1,2,1,1,1,2,2,1,2,1,2,1,1,2,2,2,2,1,2,1,2,2,1,1,1,2,2,1,1,2,1,1,2,1,1,1,2,1,2,1,2,1,2,1,1,1,1,1,2,2,2,1,1,1,1,2,2,2,1,1,1,1,2,2,1,2,1,1,1,2,1,1,1,1,1,1,1,1,2,1,2,2,1,2,1,2,1,1,2,2,1,2,1,1,2,1,1,2,2,1,1,1,2,1,2,1,2,2,1,1,2,1,1,2,1,1,2,2,1,1,2,2,1,1,1,2,1,2,2,2,1,1,1,2,2,1,1,1,1,1,2,2,2,1,1,2,1,1,2,1,1,2,2,2,2,2,1,1,1,1,2,1,2,2,1,1,2,2,2,2,1,1,2,1,1,2,2,2,1,2,1,1,2,1,2,2,1,1,1,1,1,2,1,2,1,1,1,1,1,2,2,2,2,2,1,1,1,1,1,2,2,2,2,2,1,1,2,1,2,1,1,2,1,1,1,2,2,2,1,1,2,2,2,2,1,2,2,1,1,1,2,2,2,1,2,1,1,1,2,1,2,1,2,1,1,1,2,1,1,1,2,2,1,2,1,2,2,2,1,1,1,1,1,1,2,2,2,1,2,1,1,2,1,1,1,2,1,2,1,2,1,2,1,2,2,2,1,2,1,1,1,1,1,1,2,2,2,2,2,1,2,2,1,2,1,1,1,1,2,2,2,2,2,1,2,1,2,1,2,2,2,1,2,2,1,2,1,1,1,2,1,2,1,1,2,2,1,2,1,1,2,2,1,1,1,1,1,2,2,2,2,2,2,1,1,2,2,1,2,1,2,2,1,2,1,1,1,2,2,1,2,1,2,1,2,2,1,2,2,1,1,1,1,2,2,1,1,1,2,2,1,1,2,2,2,2,2,2,1,2,2,1,1,1,1,1,1,2,2,1,2,1,2,2,1,1,1,1,2,2,2,1,1,1,2,2,1,1,1,2,1,1,1,1,1,1,1,1,2,2,1,1,1,2,1,1,2,2,2,1,2,1,2,2,1,1,2,2,1,1,2,1,1,2,2,2,1,2,2,1,2,2,1,1,2,1,1,1,1,1,1,1,2,2,2,2,1,2,1,1,2,2,2,2,2,1,1,1,1,2,1,1,2,2,1,2,2,2,1,2,2,1,1,2,1,1,1,2,2,1,1,1,1,2,2,1,2,1,1,1,1,1,2,1,2,1,1,1,2,1,2,1,2,1,1,2,1,2,1,2,1,1,2,2,1,2,2,1,2,2,2,1,1,1,2,2,1,1,2,2,1,2,1,2,2,1,1,2,1,2,2,1,1,2,1,1,1,1,2,1,2,2,1,2,1,1,2,2,1,2,2,2,2,1,1,1,1,1,2,1,1,2,2,1,1,1,2,2,1,2,1,1,2,2,2,2,1,2,2,2,1,1,2,1,1,1,1,2,2,2,2,2,2,2,2,2,1,1,2,1,2,1,2,1,1,2,2,2,2,2,2,1,2,1,1,1,2,2,2,2,1,1,2,2,2,1,2,1,2,1,1,2,2,2,1,1,2,2,2,1,1,1,2,2,2,1,2,1,2,1,1,1,2,1,2,1,1,1,1,1,2,2,1,1,1,2,2,2,1,2,2,1,1,2,2,2,2,2,1,1,2,1,1,2,2,1,2,1,1,2,2,2,1,2,1,1,1,2,2,2,1,2,1,1,2,2,1,2,1,1,1,1,2,2,2,2,2,1,1,1,1,2,1,2,1,1,1,1,2,2,2,1,2,2,1,2,2,1,2,2,1,1,2,1,2,2,1,2,1,1,1,2,1,1,1,1,1,2,1,2,1,2,1,2,2,2,1,1,2,1,1,1,1,2,1,2,2,2,2,1,1,1,2,2,1,2,1,2,1,2,2,1,2,2,1,1,2,2,1,2,1,2,2,1,1,1,1,1,2,2,1,2,2,1,1,1,2,1,2,1,1,1,2,1,2,1,2,1,2,2,2,2,2,1,1,2,1,1,2,2,2,2,1,1,2,1,1,2,2,1,2,1,2,2,1,1,1,2,1,1,2,2,1,1,1,1,2,2,2,1,2,2,1,1,1,1,1,2,2,2,1,2,1,2,2,2,2,1,1,2,2,2,1,1,1,2,2,2,1,1,1,1,1,1,2,2,1,2,2,1,1,2,2,2,2,2,2,2,2,2,2,1,2,1,1,1,2,1,2,2,2,1,1,2,2,2,2,1,2,1,2,2,2,2,1,2,1,2,2,1,2,1,2,1,2,1,2,2,1,1,2,2,1,2,1,2,1,2,2,2,1,1,2,2,2,2,1,2,2,1,1,2,2,1,2,2,1,1,2,1,1,2,2,2,1,1,2,1,2,1,1,1,2,1,2,2,1,1,1,1,2,1,2,1,1,1,1,1,1,2,2,2,2,1,2,2,2,1,2,1,2,1,1,1,1,2,1,1,1,1,1,1,1,2,1,2,1,2,1,1,2,2,1,2,1,2,1,2,2,2,2,1,1,2,1,2,1,2,2,1,2,1,2,2,1,2,2,2,2,2,2,1,1,2,1,1,1,2,2,1,2,2,1,2,2,1,2,1,1,2,1,2,1,1,2,2,2,1,2,2,1,1,1,2,2,1,2,1,2,2,2,1,1,1,1,1,2,1,1,2,1,1,2,2,2,1,2,2,1,1,2,1,2,2,2,2,1,2,1,1,1,2,1,2,2,1,1,1,1,2,2,2,2,1,1,2,1,2,2,1,2,2,1,1,2,1,1,1,1,1,1,2,2,2,2,1,2,1,2,1,1,2,2,1,1,2,2,2,2,2,1,2,1,2,2,1,2,1,2,2,1,1,2,2,2,2,2,1,1,1,1,1,2,2,1,2,2,2,2,1,1,1,2,1,1,2,2,2,1,2,2,2,2,2,1,1,1,1,1,2,1,2,1,1,2,1,2,2,2,2,2,2,2,1,1,2,2,1,1,2,1,2,2,1,2,1,1,1,1,2,1,2,1,1,2,2,1,2,2,2,1,2,2,2,2,1,2,1,2,2,1,2,2,2,2,2,2,1,1,1,1,1,2,1,1,1,2,2,2,1,2,1,2,2,2,2,1,1,1,1,2,1,1,1,2,1,2,1,2,2,1,2,1,1,1,1,1,1,2,1,1,1,2,2,1,1,1,1,2,2,1,1,2,2,1,2,1,1,1,2,2,1,1,1,2,2,1,2,1,1,1,2,1,1,1,2,2,1,2,2,2,2,2,1,1,1,2,2,1,2,2,2,2,2,2,1,2,1,1,1,2,2,1,2,1,2,2,2,1,1,1,1,2,2,2,1,1,2,1,2,1,2,2,1,2,1,1,2,2,1,1,2,2,1,1,1,1,2,1,1,2,2,2,1,2,2,2,2,1,1,2,1,1,1,2,2,2,2,2,1,1,1,1,1,2,2,1,2,1,1,1,1,1,2,2,2,1,1,2,1,1,1,2,1,1,2,2,2,2,1,1,2,2,1,2,2,2,1,1,1,1,1,2,2,1,1,1,1,1,2,2,1,2,1,1,1,1,1,2,2,2,2,1,1,2,2,1,2,1,1,1,1,1,1,2,2,2,1,1,2,2,1,1,1,1,1,1,2,2,1,2,2,2,1,1,2,1,1,1,2,2,1,1,1,1,2,1,2,2,1,1,2,1,2,1,2,1,1,2,2,2,1,1,1,1,2,1,2,1,1,1,2,2,1,1,1,2,1,2,1,2,2,2,1,2,1,1,1,2,2,2,1,2,1,1,1,2,1,2,2,2,1,1,2,2,2,2,2,1,2,1,1,1,2,1,1,2,1,1,1,2,2,2,2,2,2,2,2,1,2,2,2,2,1,1,2,1,1,1,1,2,1,2,1,1,2,1,1,1,2,1,2,1,1,1,1,1,2,1,2,1,2,1,1,1,2,1,2,1,1,2,1,2,2,1,1,1,1,1,1,1,1,2,2,2,2,2,2,1,2,2,1,2,2,2,2,2,1,2,1,2,1,2,2,1,1,2,1,1,1,1,1,2,1,2,1,1,1,1,2,2,1,2,1,2,1,1,1,2,2,2,2,1,2,1,1,2,1,1,1,1,2,2,2,1,2,1,1,2,2,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,2,2,1,1,1,2,2,2,1,2,1,2,2,2,1,2,2,2,1,1,1,2,1,1,2,1,2,2,2,2,2,1,1,1,1,2,2,1,2,1,2,1,2,1,1,1,2,1,1,1,2,2,1,2,2,2,1,2,2,1,2,2,2,1,1,1,2,1,1,2,1,2,1,1,2,2,1,2,1,1,1,2,2,2,1,1,2,2,1,1,1,2,2,1,1,2,1,2,2,1,1,1,2,2,2,1,2,2,2,1,1,2,2,1,2,1,2,2,2,1,2,1,1,1,1,1,2,1,1,1,2,2,1,1,2,2,2,1,1,1,1,1,2,1,2,2,2,2,2,2,1,1,1,1,2,2,2,2,2,1,1,2,2,2,2,2,1,1,2,1,1,1,1,2,2,2,1,2,1,1,2,1,2,2,2,1,1,2,1,2,2,1,2,1,1,2,1,1,1,2,2,2,1,1,2,1,1,2,1,2,2,1,2,2,2,1,2,1,2,2,1,2,2,2,1,1,2,1,2,1,2,2,1,1,1,1,1,2,1,1,2,2,2,2,1,1,2,1,2,1,2,1,1,1,1,2,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,1,2,2,1,2,1,2,2,2,2,2,1,1,2,2,1,2,1,2,2,1,1,1,2,1,1,1,2,1,1,2,2,1,1,2,2,2,1,1,1,2,2,2,2,2,1,2,2,2,1,1,1,1,1,2,1,1,1,2,2,2,2,1,2,2,1,2,1,1,2,1,1,2,2,1,2,2,2,1,2,2,1,2,1,1,2,2,2,1,2,1,2,1,2,1,2,2,2,2,2,1,2,1,2,1,2,1,1,1,1,1,1,1,1,1,2,2,2,1,1,1,2,1,2,1,1,1,1,1,2,2,1,2,1,1,1,1,1,1,2,1,1,1,1,1,1,2,1,2,1,2,1,1,2,1,2,2,2,2,2,1,2,1,2,2,2,1,2,2,1,1,2,2,2,2,1,1,2,2,2,2,1,2,2,2,2,1,1,1,1,1,2,1,2,2,1,2,1,1,2,1,1,2,2,2,1,1,1,1,2,2,2,2,2,1,2,1,1,2,1,1,2,1,1,2,1,2,1,1,2,2,2,1,2,1,2,1,1,2,2,1,2,2,1,1,2,1,1,2,2,1,2,2,1,2,2,2,2,1,2,2,1,1,1,2,1,2,1,1,2,2,2,2,1,1,1,2,1,2,1,2,2,1,1,1,2,1,1,1,1,2,1,2,1,1,2,1,2,2,2,1,1,1,1,2,2,2,2,2,1,1,1,1,2,1,1,1,1,2,1,1,1,1,1,2,2,1,1,1,2,1,2,1,1,1,1,2,2,2,1,1,1,2,1,1,2,1,1,1,2,2,2,2,2,2,2,1,2,2,1,1,2,1,1,2,2,1,1,1,1,2,2,1,1,2,1,1,1,2,1,2,2,2,1,2,1,1,1,1,1,1,1,2,1,2,1,1,1,1,2,2,2,2,1,2,2,2,1,2,2,1,2,2,1,2,2,2,1,2,2,2,2,1,2,2,1,2,2,1,2,1,2,2,2,1,2,1,2,2,1,2,1,1,2,1,1,2,1,1,2,2,2,1,1,1,2,2,1,2,2,2,1,1,2,2,2,1,1,1,2,2,1,1,1,1,2,2,2,1,2,2,2,2,1,1,2,2,2,1,1,1,1,2,1,2,2,1,1,2,1,2,1,2,1,1,2,1,1,1,1,1,2,1,1,2,2,1,2,1,1,2,1,2,1,1,1,1,1,1,1,2,2,2,1,2,1,1,1,2,2,1,2,1,1,1,1,2,2,1,1,1,2,2,1,2,2,2,1,1,1,2,2,1,1,2,2,1,1,1,1,2,2,1,2,2,2,2,2,1,2,2,2,2,1,2,2,2,2,1,1,2,2,2,1,1,2,2,2,1,1,2,2,2,2,2,2,2,1,2,1,1,2,2,1,1,1,1,2,2,1,2,2,1,1,1,1,2,1,2,1,1,1,1,2,1,2,1,1,1,1,1,2,2,1,1,1,2,2,1,2,2,2,2,1,1,2,1,1,2,1,2,2,1,2,2,1,1,2,1,2,2,2,1,1,1,2,2,2,2,1,1,2,2,2,1,2,2,2,2,2,2,2,1,2,1,1,2,2,1,2,1,2,1,2,1,2,2,1,2,1,2,2,1,1,2,2,2,2,2,1,2,1,2,2,1,2,2,2,2,2,2,1,2,2,1,2,2,1,2,2,2,1,2,2,1,2,1,1,2,2,1,1,2,1,2,2,1,2,2,2,2,2,1,2,1,1,2,1,2,2,1,1,2,1,2,2,1,1,2,1,2,2,2,2,1,2,1,1,2,1,1,2,2,1,1,2,2,1,1,1,2,1,1,1,2,1,1,1,1,2,2,2,2,2,2,1,2,1,2,2,2,2,1,1,1,1,1,2,2,2,1,1,1,1,1,1,1,1,1,1,2,2,2,1,2,1,1,2,1,2,2,2,1,2,1,2,1,1,2,1,2,2,2,1,2,2,1,1,2,1,1,2,2,1,2,1,2,1,1,1,1,1,2,2,1,2,1,1,2,2,2,1,2,1,2,2,1,1,2,2,2,2,1,2,2,2,1,1,2,2,1,2,2,1,1,1,2,2,1,1,1,1,1,2,2,1,2,1,2,2,2,1,2,2,1,1,1,2,2,2,1,1,1,1,2,1,2,2,1,1,2,1,2,2,1,1,1,2,2,1,2,2,2,2,1,1,2,1,1,1,1,1,2,1,2,1,2,2,1,2,2,1,1,1,1,1,2,2,1,2,2,1,1,2,2,1,2,2,2,1,1,2,2,2,1,1,2,2,1,2,2,1,1,2,2,2,2,2,2,1,2,1,2,2,1,1,2,1,2,1,1,1,1,1,1,1,2,1,2,2,1,1,2,2,2,1,2,2,2,2,2,1,1,1,2,1,2,2,1,2,2,2,1,2,2,1,2,2,2,1,2,1,2,1,2,2,1,1,2,1,1,2,1,1,2,2,1,2,2,2,2,2,1,2,2,1,1,2,1,2,2,2,2,2,2,2,1,2,1,2,2,1,2,1,1,2,2,2,2,2,1,2,2,1,2,1,2,2,1,2,2,1,1,2,1,1,1,2,2,2,1,1,2,1,2,1,2,2,1,2,2,2,1,1,2,2,1,2,1,2,2,1,2,1,1,1,2,1,1,2,1,2,1,2,2,1,2,2,1,1,2,1,1,1,1,2,2,1,1,2,2,1,2,2,2,2,1,1,1,2,1,1,1,2,2,1,1,1,1,2,2,1,2,2,2,2,1,1,2,2,2,2,2,2,2,1,1,1,1,1,2,2,2,1,1,1,2,2,1,2,1,2,2,2,2,2,1,1,2,1,1,2,2,1,1,2,2,1,2,1,1,2,1,2,2,2,2,1,2,1,1,1,1,2,1,1,1,2,2,2,2,2,1,2,1,2,2,1,2,2,2,1,2,1,2,2,2,2,1,1,1,2,2,1,1,1,1,1,1,1,1,2,2,2,1,2,2,1,2,1,2,2,2,2,2,2,1,1,1,2,1,2,2,1,1,1,2,1,2,1,2,2,2,1,2,1,1,1,1,1,2,2,1,1,2,2,2,1,1,2,1,1,2,1,1,1,1,2,2,2,2,2,1,2,2,2,1,2,2,1,1,1,1,2,1,2,2,1,1,1,1,1,1,1,2,2,2,1,1,2,1,2,2,2,1,2,2,2,2,1,1,1,1,1,2,2,1,2,1,2,1,2,1,2,1,1,2,1,2,2,1,1,2,2,1,2,1,2,1,1,1,2,2,2,1,2,1,2,2,2,2,2,2,1,2,1,1,2,2,2,2,1,1,2,2,1,1,1,2,1,2,2,1,2,1,2,2,1,1,1,2,2,2,2,2,2,1,1,1,1,2,2,2,1,2,2,2,1,1,1,1,2,1,1,2,1,2,1,1,2,2,1,2,2,2,2,2,1,2,1,2,1,2,1,1,2,2,1,1,2,2,1,2,2,2,1,2,2,1,2,1,1,2,1,2,1,1,1,1,1,2,1,1,1,2,1,1,1,1,2,2,2,1,1,1,1,1,1,2,2,1,2,1,1,1,2,2,1,2,2,2,2,1,2,2,2,1,1,2,1,2,2,2,2,2,2,1,1,2,2,1,2,2,1,1,2,1,1,2,1,1,1,1,1,2,2,1,2,1,2,1,2,2,2,1,2,1,2,2,1,2,2,1,1,1,2,1,2,2,1,1,1,1,2,2,2,2,1,2,1,2,1,2,2,2,2,1,1,2,1,2,1,1,1,2,1,2,1,2,2,1,1,1,2,2,1,1,1,2,2,2,2,1,2,1,2,2,2,2,2,1,1,2,2,1,2,2,2,2,1,1,2,1,2,2,1,2,2,2,1,2,2,2,2,2,1,2,2,2,2,2,1,2,1,2,2,2,2,2,2,2,1,2,2,1,1,1,2,1,1,2,2,2,1,1,1,2,1,1,2,1,1,1,2,1,2,1,1,2,1,2,1,2,2,1,1,2,2,1,2,1,2,2,1,2,1,2,2,2,1,2,2,1,2,2,1,2,2,1,2,2,2,2,2,2,2,2,2,2,1,1,1,1,2,1,1,2,2,1,2,1,1,1,1,1,2,1,2,2,1,2,2,2,2,1,1,2,2,1,1,1,2,2,1,2,2,1,1,1,2,1,1,2,2,1,1,1,2,2,1,1,2,1,2,2,2,2,2,2,2,1,1,2,2,2,1,1,2,2,1,1,1,1,2,1,2,2,1,1,1,2,1,1,2,1,2,1,1,2,2,1,2,2,2,1,1,2,1,1,1,2,2,1,1,1,1,1,1,1,1,2,2,1,2,2,2,1,2,1,1,1,2,2,2,2,2,2,2,1,2,2,1,2,2,1,2,2,1,2,2,2,1,1,2,2,2,2,1,1,2,1,2,2,2,2,2,2,1,2,1,2,1,2,2,1,1,2,1,1,1,2,2,1,1,1,1,2,2,1,2,2,1,2,2,2,1,1,2,2,1,1,2,2,1,2,2,1,2,2,1,1,2,2,1,2,2,2,1,1,2,1,2,1,2,1,2,2,2,1,2,1,2,2,2,1,2,2,2,1,1,2,1,1,2,2,2,2,1,1,2,2,1,2,2,2,2,2,1,1,1,1,2,1,2,2,2,1,2,2,1,1,2,2,1,2,2,2,1,2,2,1,1,2,1,1,2,2,2,2,2,1,2,2,1,1,1,2,1,1,1,2,1,2,2,1,2,1,2,2,2,2,2,1,2,1,2,1,2,1,1,2,2,1,2,1,2,1,1,1,1,2,2,1,2,1,1,1,2,1,2,1,1,2,1,1,1,2,1,2,2,1,2,1,1,1,2,1,1,1,1,2,1,2,2,2,2,2,1,1,2,1,1,2,1,1,1,1,2,1,1,2,1,2,2,2,1,2,1,1,2,1,1,1,1,2,1,1,1,1,1,1,2,1,1,2,2,2,2,2,1,2,1,2,1,2,2,2,2,2,2,1,1,1,2,2,1,2,2,2,1,1,1,1,2,2,1,1,2,2,2,1,1,2,1,2,1,1,1,2,2,1,1,2,1,1,2,1,1,1,1,1,1,2,2,1,1,2,2,1,1,2,2,1,2,2,1,2,2,2,2,2,1,2,1,2,1,2,1,2,1,2,2,2,2,2,1,1,1,2,1,2,1,2,1,1,2,2,1,2,1,2,2,2,2,2,1,1,1,2,1,1,1,2,2,1,1,1,2,2,1,1,2,2,1,2,2,2,1,2,2,2,2,2,2,2,1,2,2,2,2,2,1,2,2,2,1,2,2,2,1,2,1,1,2,2,1,2,2,2,2,2,1,2,1,2,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,2,2,1,2,1,1,1,1,1,1,2,1,1,1,2,1,2,2,2,1,2,2,1,2,2,1,1,1,1,2,2,2,1,1,1,1,1,2,1,1,1,2,2,1,1,1,2,1,1,2,2,2,1,1,1,2,2,2,2,1,2,2,2,2,2,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,1,2,2,1,1,2,2,2,2,2,1,2,1,2,1,1,1,2,2,2,2,2,1,1,1,2,2,1,1,2,2,1,2,2,2,2,1,1,2,2,2,1,1,1,1,1,1,2,1,1,1,2,1,1,2,2,2,1,2,2,1,1,2,1,1,2,2,1,2,2,2,2,2,1,1,2,2,2,1,1,2,1,2,2,2,2,1,1,1,1,2,1,2,2,2,2,1,1,1,2,2,1,2,1,1,2,1,1,1,2,1,2,2,2,1,2,2,2,2,2,2,2,2,1,1,1,2,1,2,1,2,2,2,2,1,2,1,1,2,1,1,2,1,1,1,1,2,1,1,1,2,2,2,2,2,1,2,2,1,2,2,2,2,1,1,2,2,1,2,1,2,1,2,1,2,2,2,2,2,2,1,1,1,2,2,1,2,1,2,2,1,1,1,2,2,1,1,1,2,2,2,1,2,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,1,2,1,2,2,2,2,2,1,2,2,1,2,2,1,2,1,2,1,2,1,2,2,2,2,1,1,2,2,2,2,2,1,1,1,1,2,1,1,2,1,1,2,2,1,1,2,1,2,1,2,2,2,2,1,2,1,1,2,2,1,2,2,2,1,1,1,1,1,2,2,2,2,2,2,2,2,1,1,1,2,2,2,1,2,2,1,1,1,1,1,2,1,2,2,2,2,1,2,1,1,1,2,2,2,2,2,2,2,2,2,1,1,1,1,2,2,2,1,1,2,2,1,2,1,2,1,1,2,1,2,2,1,2,1,2,1,2,2,2,2,1,2,2,1,1,2,1,1,2,1,1,2,1,1,2,2,1,1,2,1,2,1,2,2,2,2,2,1,1,2,1,2,2,2,1,1,1,1,2,1,2,2,2,1,1,1,1,2,1,1,2,1,1,2,1,1,2,2,2,1,1,2,1,2,1,2,1,1,1,1,2,2,1,2,2,1,1,2,2,1,1,1,2,2,1,1,2,2,1,1,2,1,2,2,2,1,2,1,1,1,1,1,2,2,2,2,1,2,2,1,2,2,1,1,2,2,1,2,2,2,2,1,1,1,2,2,2,1,2,2,2,2,1,2,1,2,1,2,2,1,1,1,2,1,2,2,2,2,2,2,1,2,2,1,2,2,1,1,2,2,1,2,1,1,2,1,1,2,2,2,1,1,2,1,2,1,2,2,2,1,2,2,2,1,2,2,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1,1,2,2,2,1,1,2,2,1,2,2,1,1,2,2,1,1,2,2,1,1,1,1,1,1,2,2,2,1,2,2,2,1,1,1,2,2,2,1,2,1,1,1,1,2,1,2,2,1,1,2,1,1,1,2,1,2,1,1,1,1,2,1,1,2,1,2,1,1,1,2,1,2,2,1,1,1,2,1,2,1,1,2,2,1,2,2,2,2,1,2,2,2,1,2,2,1,1,1,1,2,1,2,1,1,2,1,2,2,2,1,2,1,1,1,1,1,1,2,1,2,1,2,1,2,1,1,1,1,2,1,2,1,1,1,2,1,1,2,1,1,1,1,2,1,1,1,2,2,2,1,2,2,1,1,2,2,2,2,2,1,2,2,1,2,2,2,1,2,1,2,1,2,1,2,2,1,1,2,2,2,1,1,2,1,1,2,1,2,2,1,2,1,1,2,2,2,2,1,1,2,1,1,2,1,2,1,2,1,1,1,2,2,2,2,1,2,1,1,2,1,2,2,2,2,1,1,1,2,2,2,1,2,1,1,1,2,1,2,2,2,2,1,2,1,2,2,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,1,2,2,1,2,2,2,2,2,1,1,2,2,1,2,2,1,2,1,1,2,2,2,1,1,2,2,2,1,2,2,1,1,1,2,1,2,1,2,1,1,2,2,1,2,2,2,2,1,2,2,2,2,1,2,1,2,2,2,2,1,1,1,2,2,1,2,1,1,2,2,1,2,2,1,1,2,1,1,1,1,2,2,1,2,1,1,2,1,2,1,1,2,1,1,2,2,2,1,2,2,1,2,2,1,2,2,2,2,2,1,2,2,2,2,1,1,2,1,1,2,2,2,2,1,2,1,2,2,1,1,1,1,1,2,1,2,1,1,2,2,2,1,2,2,2,1,2,2,2,2,2,2,2,2,2,2,2,1,1,2,1,2,1,1,2,1,2,2,1,1,1,2,1,2,1,1,2,1,2,1,2,1,2,1,2,1,2,2,1,2,2,1,1,1,1,2,1,1,2,1,2,2,2,1,1,1,1,2,1,2,1,2,1,2,1,2,2,1,2,2,2,2,2,2,1,1,2,2,2,2,1,2,1,2,1,1,1,2,1,2,2,1,1,1,2,2,1,2,2,2,2,2,1,1,1,1,1,2,1,1,1,2,2,2,1,2,1,1,1,1,2,2,1,1,1,1,1,1,2,1,1,1,2,2,1,1,2,2,1,1,2,2,2,2,1,2,1,1,1,2,2,2,2,1,2,2,2,1,1,2,1,1,2,1,1,2,2,1,2,1,2,1,2,2,2,1,1,2,2,1,1,1,2,1,2,1,1,2,1,2,1,2,2,1,1,2,1,2,1,2,2,2,1,2,2,1,1,1,2,1,1,1,1,2,1,1,1,1,2,2,2,2,1,2,2,2,1,2,1,2,1,1,2,2,2,1,1,1,2,1,1,2,2,2,1,1,1,1,1,2,2,2,1,1,2,2,2,1,1,1,2,2,2,2,2,1,1,2,2,1,2,2,1,1,1,1,1,1,1,1,2,1,2,2,1,2,2,1,1,1,1,1,1,2,2,1,1,2,1,1,2,1,2,1,1,1,2,2,2,1,2,2,1,1,2,1,2,1,2,1,1,1,2,1,2,1,2,1,1,2,2,1,2,1,1,1,2,1,2,1,1,2,1,2,2,1,1,2,1,1,2,1,1,2,1,2,2,1,1,2,1,1,1,1,1,2,1,1,2,1,2,2,2,2,2,2,1,1,2,1,2,1,2,2,2,2,1,1,2,2,1,1,2,2,1,1,2,2,1,2,1,1,2,1,1,1,2,2,2,1,1,2,2,1,2,1,2,1,1,1,2,1,1,2,2,1,2,1,1,1,1,1,1,1,2,1,1,2,2,1,2,1,1,2,2,2,2,1,2,1,2,2,1,2,2,1,2,1,1,2,1,1,1,2,1,2,2,1,2,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,2,1,1,1,1,2,2,2,2,1,1,2,2,1,2,2,1,1,2,1,1,1,2,2,2,2,1,2,2,2,1,2,2,2,2,1,1,2,1,2,2,2,2,1,2,2,2,2,2,1,1,1,2,2,1,1,2,2,1,2,2,1,2,1,2,1,2,1,1,1,1,1,1,2,2,2,2,2,1,1,1,1,2,1,1,1,1,1,2,2,1,2,2,1,1,2,2,2,2,1,1,1,1,1,2,1,2,2,2,1,2,1,2,2,1,2,1,1,1,2,1,2,1,2,1,1,1,1,2,2,2,2,2,2,2,2,1,2,1,2,2,1,1,1,2,1,2,1,2,1,1,1,2,1,2,1,2,1,2,2,1,1,2,1,2,1,2,2,1,2,2,2,1,2,2,1,1,1,1,1,1,2,1,1,2,2,1,1,1,1,1,2,2,2,2,2,1,2,2,1,1,2,1,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,1,2,1,2,1,1,1,2,1,1,2,2,2,1,2,1,1,2,2,1,1,1,2,2,1,1,2,1,2,2,1,1,1,2,1,1,2,1,1,1,1,2,1,1,1,2,2,2,2,2,1,1,2,1,1,2,2,2,2,2,1,2,1,1,2,2,2,2,1,1,1,2,2,1,2,1,1,1,1,1,1,2,1,2,2,2,1,1,2,2,1,1,2,2,1,1,1,1,2,2,2,1,1,2,1,1,2,2,2,2,1,2,2,1,1,2,2,1,2,2,1,1,2,1,1,1,1,2,2,1,2,2,2,2,1,1,1,1,2,2,2,2,2,2,1,2,1,2,1,2,2,1,2,2,1,1,1,2,1,2,1,1,1,2,1,1,2,1,2,2,2,1,1,2,2,1,2,1,2,1,1,1,1,2,2,2,1,1,2,1,2,2,1,2,1,2,2,2,2,2,1,1,2,2,1,1,1,1,2,1,2,1,1,2,2,1,1,1,1,1,2,1,1,2,1,1,1,2,2,1,2,2,2,2,2,1,2,2,1,2,2,2,1,1,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,2,1,2,1,1,2,1,1,1,1,2,1,1,2,2,2,2,1,2,1,2,1,1,2,2,1,2,1,1,2,2,1,2,2,1,1,2,1,2,1,2,1,1,1,1,2,2,1,1,2,2,2,1,1,2,2,2,2,2,1,2,1,2,1,2,1,1,2,1,1,2,2,1,1,2,2,1,1,1,2,1,2,2,1,2,2,1,1,2,2,2,2,1,2,1,1,1,2,1,1,1,1,2,2,2,1,2,1,1,1,2,1,2,1,1,1,2,1,1,2,1,2,1,1,2,2,2,1,1,1,1,2,1,1,1,1,2,2,1,2,2,2,1,1,2,1,1,2,1,1,1,1,1,2,2,1,2,2,1,2,1,1,1,1,2,2,1,2,1,1,1,1,1,1,2,2,1,2,1,1,2,2,2,2,2,2,1,1,1,1,1,1,2,2,1,1,1,2,1,2,1,2,1,2,1,1,2,1,2,2,1,1,2,1,1,1,2,1,1,1,2,1,1,1,2,1,2,1,1,1,1,2,2,1,1,1,1,1,2,1,1,1,2,2,2,2,1,2,1,1,2,2,1,1,1,1,1,2,1,1,2,2,1,2,1,1,2,1,1,1,1,1,2,2,2,1,2,1,1,2,1,2,1,1,1,2,2,2,1,2,2,1,1,2,1,2,1,1,1,2,2,1,2,2,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,2,2,2,2,2,1,1,1,1,1,2,1,2,2,2,2,1,2,2,2,2,1,1,1,2,1,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,1,2,1,2,1,2,2,2,1,2,1,1,2,1,2,2,1,2,1,1,2,2,1,2,1,2,1,1,2,1,1,1,2,1,1,2,1,1,1,2,1,2,2,1,1,2,2,2,1,1,2,2,1,2,1,1,2,1,1,2,1,1,2,1,2,2,2,2,2,1,1,2,1,2,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,2,2,1,1,1,1,1,1,1,2,1,1,2,2,2,2,1};
        int[] result = DistantBarcodes.rearrangeBarcodes(input);
        assertArray(result, input);
    }

    @Test
    public void rearrangeBarcodes7() {
        int[] input = new int[]{2,2,1,3};
        int[] result = DistantBarcodes.rearrangeBarcodes(input);
        assertArray(result, input);
    }

    private void assertArray(int[] result, int[] input){
        List<Integer> inputList = Arrays.stream(input).boxed().collect(Collectors.toList());
        List<Integer> resultList = Arrays.stream(result).boxed().collect(Collectors.toList());
        Collections.sort(inputList);
        Collections.sort(resultList);
        System.out.println(inputList);
        System.out.println(resultList);
        if(!inputList.equals(resultList)){
            fail();
        }
        for(int i=1;i<result.length-1;i++){
            if(result[i] == result[i-1] || result[i] == result[i+1]){
                fail();
                return;
            }
        }
        assertTrue(true);
    }

}