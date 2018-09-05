package ru.job4j.square;

import java.util.Arrays;

public class Square {

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
         rst[0] = 1;
         rst[1] = 2;
         rst[2] = 3;
         rst[3] = 4;
         rst[4] = 5;

        for (int x = 0; x < rst.length; x++) {
           rst[x] *= rst[x];
            System.out.println(Arrays.toString(rst));
        }
        return rst;
    }
}