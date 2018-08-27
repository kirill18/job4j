package ru.job4j.max;

import org.junit.Test;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(10, 15, 8);
        assertThat(result, is(15));
    }
}