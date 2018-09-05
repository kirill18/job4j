package ru.job4j.board;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int j = 0; height > j; j++) {

            for (int i = 0; width > i; i++) {

                if ((j + i) % 2 == 0) {

                    screen.append("X");

                } else {

                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        System.out.println(screen.toString());
        return screen.toString();
    }
}