package ru.job4j.turn;

import java.util.Arrays;

public class Turn {
    public int[] turn(int[] array) {
            for (int index = 0; index < array.length - index; index++) {
                System.out.println(Arrays.toString(array));
               int temp = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp;
            }
        return array;
    }
}


