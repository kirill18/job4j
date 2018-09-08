package ru.job4j.check;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.0
 * @since 08.09.2018
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
           if (data[i] == data[i+1]) {
               result = true;
           }
           else  {
               result = false;
               break;
           }
        }
        return result;
    }
}

