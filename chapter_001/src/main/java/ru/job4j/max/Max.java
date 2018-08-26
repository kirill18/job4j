package ru.job4j.max;

public class Max {

    public int max(int first, int second) {
        int value = first-second>0 ? first : second;
        return value;
    }
}