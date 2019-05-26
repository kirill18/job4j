package ru.job4j.thirdsortarray;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.2
 * @since 16.09.2018
 */

public class ThirdSortArray {

    /**
     * Метод помещает значения из двух сортированных массивов в терий, с последующей его сортировкой.
     *
     * @param array1,array2 суммируемые мвассивы.
     * @return возвращает третий отсортированный массив
     */

    public int[] plusSortArrays(int[] array1, int[] array2) {
        int[] sumArray = new int[array1.length + array2.length];
                int i = 0, j = 0;
        for (int index = 0; index < sumArray.length; index++) {
                if (i > array1.length - 1) {
                sumArray[index] = array2[j++];
                }
            else if (j > array2.length - 1) {
                sumArray[index] = array1[i++];
            }
                else if (array1[i] < array2[j]) {
                sumArray[index] = array1[i++];
                }
            else {
                sumArray[index] = array2[j++];
            }
        }
        return sumArray;
    }
}

