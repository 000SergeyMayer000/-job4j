package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

//    @Test
//    public void whenLeftLessThanRightResultShouldBeNegative() {
//        StringCompare compare = new StringCompare();
//        int rst = compare.compare(
//                "Ivanov",
//                "Ivanova"
//        );
//        assertThat(rst, lessThan(0));
//    }

//    @Test
//    public void whenLeftGreaterThanRightResultShouldBePositive() {
//        StringCompare compare = new StringCompare();
//        int rst = compare.compare(
//                "Petrov",
//                "Ivanova"
//        );
//        assertThat(rst, greaterThan(0));
//    }
//
//    @Test
//    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
//        StringCompare compare = new StringCompare();
//        int rst = compare.compare(
//                "Petrov",
//                "Patrov"
//        );
//        assertThat(rst, greaterThan(0));
//    }

//    @Test
//    public void secondCharOfLeftLessThanRightShouldBeNegative() {
//        StringCompare compare = new StringCompare();
//        int rst = compare.compare(
//                "Patrova",
//                "Petrov"
//        );
//        assertThat(rst, lessThan(0));
//    }
//
//    @Test
//    public void whenLeftLargeThanRightResultShouldBePositiv() {
//        StringCompare compare = new StringCompare();
//        int rst = compare.compare(
//                "Ivanova",
//                "Ivanov"
//        );
//        assertThat(rst, greaterThan(0));
//    }


    @Test
    public void whenStringsIntegerAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "123456",
                "123456"
        );
        assertThat(rst, is(0));
    }

//    @Test
//    public void secondIntegerOfLeftLessThanRightShouldBeNegative() {
//        StringCompare compare = new StringCompare();
//        int rst = compare.compare(
//                "123456789",
//                "133456789"
//        );
//        assertThat(rst, lessThan(0));
//    }
//
//    @Test
//    public void whenLeftIntegerLessThanRightResultShouldBeNegative() {
//        StringCompare compare = new StringCompare();
//        int rst = compare.compare(
//                "12345",
//                "1234567"
//        );
//        assertThat(rst, lessThan(0));
//    }

//    @Test
//    public void whenLeftIntegerLargeThanRightResultShouldBePositiv() {
//        StringCompare compare = new StringCompare();
//        int rst = compare.compare(
//                "1234567",
//                "123456"
//        );
//        assertThat(rst, greaterThan(0));
//    }
}