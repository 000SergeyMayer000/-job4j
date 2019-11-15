package ru.job4j.strategy;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class SquareTest {
    @Test
    public void whenDraweSquare() {
        Square square = new Square();
        assertThat(square.draw(),
                is(new StringBuilder().append("+++++++\n").append("+     +\n").append("+     +\n").append("+++++++\n").toString())
        );
    }
}

