package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter coun = new Counter();
        int result = coun.add(0, 10);
        int expected = (0 + 2 + 4 + 6 + 8 + 10);
        assertThat(result, is(expected));
    }
}