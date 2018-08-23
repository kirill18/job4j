package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;

import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void aDistanceToB() {
        Point a = new Point(3, 6);
        Point b = new Point(4, 9);
        double result = a.distanceTo(b);
        double expected = 3.1;
        assertThat(result, closeTo(expected, 0.1));
    }
}