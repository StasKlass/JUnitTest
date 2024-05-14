package org.example;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class ArrayUtilTest {

    @Test
    public void testSortArray() {
        int[] inputArray = {5, 2, 9, 1, 7};

        int[] sortedArray = ArrayUtil.sortArray(inputArray);

        int[] expectedArray = {1, 2, 5, 7, 9};

        assertArrayEquals(expectedArray, sortedArray);
    }
}
