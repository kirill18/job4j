package ru.job4j.arrayduplicate;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.0
 * @since 11.09.2018
 */
import java.util.Arrays;

public class ArrayDuplicate {

    /**
     * Метод исключает дуюликаты из массива
     *
     * @param array input array.
     * @return array without duplicates.
     */

public String[] removeDuplicates(String[] array) {
    int unique = array.length;
    for (int out = 0; out < unique; out++) {
        for (int in = out + 1; in < unique; in++){
            if (array[out].equals(array[in])) {
            array[in] = array[unique-1];
            unique--;
            in--;
            }
        }
    }
    return Arrays.copyOf(array, unique);
}
}
