package ru.job4j.square;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.2
 * @since 07.09.2018
 */

public class Square {

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int n = 0; n < rst.length; n++) {
            rst[n] = (n + 1) * (n + 1);
        }
        return rst;
    }
}