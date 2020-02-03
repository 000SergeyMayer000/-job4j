package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        Departments departments = new Departments();
        List<String> input = Arrays.asList("k1/sk1/ssk1");
        List<String> expectd = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        departments.sortAsc(result);
        assertThat(result, is(expectd));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expectd = Arrays.asList("k1/sk1", "k1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expectd));
    }

    @Test
    public void whenSecondMissed() {
        Departments departments = new Departments();
        List<String> input = Arrays.asList("k1", "k1/sk1/ssk1");
        List<String> expectd = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        departments.sortAsc(result);
        assertThat(result, is(expectd));
    }
}
