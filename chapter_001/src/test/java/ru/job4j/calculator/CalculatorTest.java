package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(20.0, 10.0);
        double expected = 30.0;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddOneSubOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.subtract(1D, 1D);
        double expected = 10;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddDivPlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.div(20.0, 10.0);
        double expected = 200.0;
        assertThat(result, is(expected));
    }
    @Test
    public void whenAddMultiplePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.multiple(20.0, 10.0);
        double expected = 2.0;
        assertThat(result, is(expected));
    }

}