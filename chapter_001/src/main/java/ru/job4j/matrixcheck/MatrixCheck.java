package ru.job4j.matrixcheck;


public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length-1; i++) {
            if (data[0][0] != data[i+1][i+1] || data[data.length - i -1][i] != data[0][0]) {
                    result = false;
                    break;
                }
        }
        return result;
        }
    }