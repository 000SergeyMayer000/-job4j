package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when3ElementsThen11() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when2ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
                2
        );
        int[][] expect = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when2ArraysThen1List() {
        ConvertList2Array convertList2Array = new ConvertList2Array();
        List<int[]> arrays = new ArrayList<>();
        arrays.add(new int[]{1, 2});
        arrays.add(new int[]{3, 4, 5, 6});
        List<Integer> result = convertList2Array.convert(arrays);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(result, is(expect));
    }

    @Test
    public void when3ArraysThen1List() {
        ConvertList2Array convertList2Array = new ConvertList2Array();
        List<int[]> arrays = new ArrayList<>();
        arrays.add(new int[]{1, 2, 3});
        arrays.add(new int[]{4, 5, 6});
        arrays.add(new int[]{11, 22, 33, 44});
        List<Integer> result = convertList2Array.convert(arrays);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 11, 22, 33, 44);
        assertThat(result, is(expect));
    }
}
