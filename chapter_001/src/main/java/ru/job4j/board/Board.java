package ru.job4j.board;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (; height > 0; height--) {

            for (; width !=0; width--) {

                if ((width + height) % 2 == 0) {

                    screen.append("X");

                } else {

                    screen.append(" ");
                }
            }
            screen.append(ln);
            width++;
            width++;
            width++;
        }
        System.out.println(screen.toString());
        return screen.toString();
    }
}