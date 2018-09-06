package ru.job4j.square;

import java.util.Arrays;

public class Square {

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int n = 0; n < rst.length; n++) {
            rst[n] = n + 1;
            rst[n] *= rst[n];
            System.out.println(Arrays.toString(rst));
        }
        return rst;
    }
}