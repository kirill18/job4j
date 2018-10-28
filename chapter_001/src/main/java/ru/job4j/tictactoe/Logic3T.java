package ru.job4j.tictactoe;

import java.util.function.Predicate;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {

        this.table = table;
    }

    public boolean isWinnerX() {
    boolean result = false;
        for (int i = 0; i < table.length; i++) {
            if (fillBy(Figure3T::hasMarkX, 0, i, 1, 0) || fillBy(Figure3T::hasMarkX, i, 0, 0, 1)) {
                result = true;
                break;
            }
            }
        if (result || fillBy(Figure3T::hasMarkX, 0, 0, 1, 1)
                || fillBy(Figure3T::hasMarkX, this.table.length - 1, 0, -1, 1)) {
            result = true;
        }
          return result;
    }


    public boolean isWinnerO() {
        boolean result = false;
        for (int i = 0; i < table.length; i++) {
            if (fillBy(Figure3T::hasMarkO, 0, i, 1, 0) || fillBy(Figure3T::hasMarkO, i, 0, 0, 1)) {
                result = true;
                break;
            }
        }
        if (result || fillBy(Figure3T::hasMarkO, 0, 0, 1, 1)
                || fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1)) {
            result = true;
        }
        return result;
    }

    public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
        boolean result = true;
            for (int j = 0; j != this.table.length; j++) {
                Figure3T cell = this.table[startX][startY];
                startX += deltaX;
                startY += deltaY;
                if (!predicate.test(cell)) {
                    result = false;
                    break;
                }
        }
        return result;
    }

        public boolean hasGap() {
            boolean result = false;
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table.length; j++) {
                    if (!table[i][j].hasMarkO() && !table[i][j].hasMarkX()) {
                        result = true;
                        break;
                    }
                }
                if (result) {
                    break;
                }
            }
            return result;
        }
    }
