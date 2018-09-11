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
        while (!isSorted) {
            isSorted = true;
            for (int j = array.length - 1; j >= 1; j--) {
                for (int i = 0; i < j; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        int buf = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buf;
                    }
                }
            }
        }
        return array;
    }
}








