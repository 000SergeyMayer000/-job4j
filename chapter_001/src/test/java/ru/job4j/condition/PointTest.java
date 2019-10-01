package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
Point point = new Point();
double in =3;
double expected = point.distance(0,0,3,0);
        Assert.assertEquals(expected,in,0.1);
    }
}