package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

        @Test
        public void whenNot() {
            ArrayChar word = new ArrayChar("1");
            boolean result = word.startWith("2");
            assertThat(result, is(false));
        }


    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
    @Test
    public void when() {
        ArrayChar word = new ArrayChar("Здравfgствуй жопа");
        boolean result = word.startWith("Здравствуй жопа");
        assertThat(result, is(false));
    }
}