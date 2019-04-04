package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(15, 10, 2);
        assertThat(result, is(15));
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(15, 16, 2);
        assertThat(result, is(16));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(15, 16, 22);
        assertThat(result, is(22));
    }
    @Test
    public void whenFirstEquallySecondquallyThird() {
        MultiMax check = new MultiMax();
        int result = check.max(100, 100, 100);
        assertThat(result, is(100));
    }
}