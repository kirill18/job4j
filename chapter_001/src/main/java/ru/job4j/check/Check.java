package ru.job4j.check;

/**
 * @author Kirill Lityuchii (kirill_lityuchii@mail.ru)
 * @version 1.0
 * @since 08.09.2018
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 1; i < data.length; i++) {
           if (data[0] != data[i]) {
               result = false;
               break;
           }
           else  {
               result = true;
           }
        }
        return result;
    }
}

