package ru.job4j.sort;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.2
 * @since 07.09.2018
 */

public class Sort {

    /**
     * Проверяет. что массив отсортирован.
     *
     * @param array отсортированный массив.
     * @return возвращает true, если массив отсортирован.
     */

    public boolean sort(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}