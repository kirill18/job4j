package ru.job4j.tictactoe;

import java.util.function.Predicate;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = false;
        if (table[0][0].hasMarkX() && table[1][1].hasMarkX() && table[2][2].hasMarkX()) {
        result = true;
   } else if (table[0][2].hasMarkX() && table[1][1].hasMarkX() && table[2][0].hasMarkX()) {
        result = true;
    } else if (table[0][0].hasMarkX() && table[1][0].hasMarkX() && table[2][0].hasMarkX()) {
        result = true;
    } else if (table[0][1].hasMarkX() && table[1][1].hasMarkX() && table[2][1].hasMarkX()) {
        result = true;
    } else if (table[0][2].hasMarkX() && table[1][2].hasMarkX() && table[2][2].hasMarkX()) {
        result = true;
    } else if (table[0][0].hasMarkX() && table[0][1].hasMarkX() && table[0][2].hasMarkX()) {
        result = true;
    } else if (table[1][0].hasMarkX() && table[1][1].hasMarkX() && table[1][2].hasMarkX()) {
        result = true;
    } else if (table[2][0].hasMarkX() && table[2][1].hasMarkX() && table[2][2].hasMarkX()) {
        result = true;
        }
        return result;
    }

        public boolean isWinnerO() {
            return this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 0)
                    ||
                    this.fillBy(Figure3T::hasMarkO, 0, 0, 0, 1)
                    ||
                    this.fillBy(Figure3T::hasMarkO, 0, 0, 1, 1)
                    ||
                    this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, -1, 1)
                    ||
                    this.fillBy(Figure3T::hasMarkO, this.table.length - 2, 0, 0, 1)
                    ||
                    this.fillBy(Figure3T::hasMarkO, this.table.length - 1, 0, 0, 1)
                    ||
                    this.fillBy(Figure3T::hasMarkO, 0, this.table.length - 1, 1, 0)
                    ||
                    this.fillBy(Figure3T::hasMarkO, 0, this.table.length - 2, 1, 0);
        }

        public boolean fillBy(Predicate<Figure3T> predicate, int startX, int startY, int deltaX, int deltaY) {
            boolean result = true;
            for (int index = 0; index != this.table.length; index++) {
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
                    }
                }
            }
            return result;
        }
    }
