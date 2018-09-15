package ru.job4j.thirdsortarray;

public class ThirdSortArray {

    public int[] PlusSortArrays(int[] array1, int[] array2) {
        int[] SumArray = new int[array1.length + array2.length];
         /*Индексы эллементов суммируемых массивов.Образуют собой буфер.
        В результате сравнения индексов i и j в буфере будет храниться большее значение
        для последующего сравнения с следующим эллементом одного из суммируемых массивов.*/
        int i = 0, j = 0;
        for (int index = 0; index < SumArray.length; index++) {
        /*Проверяет чтобы эллементы суммируемыех массивов не были превышены.
         Если индексы i или j превысят колличество эллементов в суммируемых массивах, то
           значит осталься последний наибольший эллемент.*/
            if (i > array1.length - 1) {
                int a = array2[j];
                SumArray[index] = a;
                j++;
            } else if (j > array2.length - 1) {
                int a = array1[i];
                SumArray[index] = a;
                i++;
                /*Проверяет наибольший эллемент из суммируемых массивов.
                 результате сравнения наименьшее значение записывается в результирующий массив.
                 Переходит к следующему эллементу массива в котором было минимальное значение
                 для последующего его сравнения с максимальным эллементом по результатам предыдущей операции.*/
            } else if (array1[i] < array2[j]) {
                int a = array1[i];
                SumArray[index] = a;
                i++;
            } else {
                int b = array2[j];
                SumArray[index] = b;
                j++;
            }
        }
        return SumArray;
    }
}

