package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayWithSeventeenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{12, 9, 8, 7, 16, 10, 6, 5, 15, 17, 4, 14, 11, 3, 2, 1, 0, 13};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        assertThat(result, is(expect));
    }
}