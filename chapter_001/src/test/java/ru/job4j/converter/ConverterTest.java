package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        double result = converter.rubleToDollar(120D);
        assertThat(result, is(2D));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        double result = converter.rubleToEuro(140D);
        assertThat(result, is(2D));
    }

    @Test
    public void when1dollarToRubleThen60() {
        Converter converter = new Converter();
        double result = converter.dollarToRubli(1D);
        assertThat(result, is(60D));
    }
    @Test
    public void when1evroToRubleThen70() {
        Converter converter = new Converter();
        double result = converter.evroToRubli(2D);
        assertThat(result, is(140D));
    }

}