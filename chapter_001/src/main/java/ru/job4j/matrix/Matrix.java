package ru.job4j.matrix;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.0
 * @since 09.09.2018
 */

public class Matrix {

    /**
     * Метод поочередно перемножает все элементы матрицы
     *
     * @param size размер матрицы.
     * @return возвращает двумерный массив с перемноженными элементами
     */

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
