package ru.job4j.bubblesort;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.2
 * @since 07.09.2018
 */

public class BubbleSort {

    /**
     * Метод сортирует пузырьком.
     *
     * @param array сортируемый массив.
     * @return возвращает отсортированный массив
     */

    public int[] sort(int[] array) {
               boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }
}







