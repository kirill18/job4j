package ru.job4j.max;

public class Max {


    public int max(int first, int second) {
        return first - second > 0 ? first : second;
    }
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        this.max(temp, third);
        return temp;
    }
}
