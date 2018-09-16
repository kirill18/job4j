package ru.job4j.thirdsortarray;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ThirdSortArrayTest {
    @Test
    public void whenThirdArrayThisSumFirstAndSeconaArrays() {
        ThirdSortArray thirdarray = new ThirdSortArray();
        int[] input1 = new int[] {1, 3, 5, 7, 9};
        int[] input2 = new int[] {0, 2, 4, 6};
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        int[] result = thirdarray.plusSortArrays(input1, input2);
        assertThat(result, is(expect));
    }
    @Test
    public void whenThirdArrayThisSumNullFirstAndSeconaArrays() {
        ThirdSortArray thirdarray = new ThirdSortArray();
        int[] input1 = new int[] {};
        int[] input2 = new int[] {0, 2, 4, 6};
        int[] expect = {0, 2, 4, 6};
        int[] result = thirdarray.plusSortArrays(input1, input2);
        assertThat(result, is(expect));
    }
    @Test
    public void whenThirdArrayThisSumFirstAndNullSeconaArrays() {
        ThirdSortArray thirdarray = new ThirdSortArray();
        int[] input1 = new int[] {1, 3, 5, 7, 9};
        int[] input2 = new int[] {};
        int[] expect = {1, 3, 5, 7, 9};
        int[] result = thirdarray.plusSortArrays(input1, input2);
        assertThat(result, is(expect));
    }
    @Test
    public void whenThirdArrayThisSumFirstAndSeconaArrays1() {
        ThirdSortArray thirdarray = new ThirdSortArray();
        int[] input1 = new int[] {1, 3, 5};
        int[] input2 = new int[] {0, 2, 4, 6};
        int[] expect = {0, 1, 2, 3, 4, 5, 6};
        int[] result = thirdarray.plusSortArrays(input1, input2);
        assertThat(result, is(expect));
    }
}