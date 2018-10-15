package ru.job4j.tictactoe;


public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {

        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = true;
        for (int i = 0; i < table.length; i++) {
            result = true;
            for (int j = 0; j < table.length - 1; j++) {
                if (!(table[j][i].hasMarkX() && table[j + 1][i].hasMarkX())) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        if (!result) {
            for (int i = 0; i < table.length; i++) {
                result = true;
                for (int j = 0; j < table.length - 1; j++) {
                    if (!(table[i][j].hasMarkX() && table[i][j + 1].hasMarkX())) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 0; i < table.length; i++) {
                result = true;
                for (int j = 0; j < table.length - 1; j++) {
                    if (!(table[j][table.length - j - 1].hasMarkX() && table[table.length - 1][0].hasMarkX())) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    break;
                }
            }
        }
        if (!result) {
            for (int i = 0; i < table.length; i++) {
                result = true;
                for (int j = 0; j < table.length - 1; j++) {
                    if (!(table[j][j].hasMarkX() && table[j + 1][j + 1].hasMarkX())) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = true;
        for (int i = 0; i < table.length; i++) {
            result = true;
            for (int j = 0; j < table.length - 1; j++) {
                if (!(table[j][i].hasMarkO() && table[j + 1][i].hasMarkO())) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        if (!result) {
            for (int i = 0; i < table.length; i++) {
                result = true;
                for (int j = 0; j < table.length - 1; j++) {
                    if (!(table[i][j].hasMarkO() && table[i][j + 1].hasMarkO())) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    break;
                }
            }
        }
        if (!result) {
        for (int i = 0; i < table.length; i++) {
            result = true;
            for (int j = 0; j < table.length - 1; j++) {
                if (!(table[j][table.length - j - 1].hasMarkO() && table[table.length - 1][0].hasMarkO())) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
    }
        if (!result) {
            for (int i = 0; i < table.length; i++) {
                result = true;
                for (int j = 0; j < table.length - 1; j++) {
                    if (!(table[j][j].hasMarkO() && table[j + 1][j + 1].hasMarkO())) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    break;
                }
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
