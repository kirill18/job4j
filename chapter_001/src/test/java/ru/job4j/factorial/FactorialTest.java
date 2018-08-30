package ru.job4j.factorial;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {

    @Test
    public void voidwhenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial1 = new Factorial();
        int result = factorial1.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}