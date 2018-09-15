package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortTest {
    @Test
    public void WhenSort () {
        Sort sorted = new Sort();
        int[] input = new int[] {0, 5, 7, 8, 9, 15, 19, 20, 23, 28};
        boolean result = sorted.sort(input);
        assertThat(result, is(true));
    }
    @Test
    public void WhenNotSort () {
        Sort sorted = new Sort();
        int[] input = new int[] {0, 30, 7, 8, 9, 40, 19, 20, 23, 1};
        boolean result = sorted.sort(input);
        assertThat(result, is(false));
    }
}