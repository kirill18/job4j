package ru.job4j.findloop;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.2
 * @since 07.09.2018
 */

public class FindLoop {

    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}