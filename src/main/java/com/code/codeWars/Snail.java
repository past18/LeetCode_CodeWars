package com.code.codeWars;

import java.util.Arrays;

public class Snail {
    public static final int WALL = -1;

    public static int[] snail(int[][] array) {
        if (array[0].length <= 0) {
            return new int[0];
        }

        int n = array.length;
        int[] result = new int[n * n];
        int x = 0, y = 0;
        int xSte = 1, ySte = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = array[y][x];
            array[y][x] = WALL;

            x += xSte;
            y += ySte;

            if (xSte != 0 && (x < 0 || x >= n || array[y][x] == WALL)) {
                x += -xSte;
                y += xSte;
                ySte = xSte;
                xSte = 0;
            } else if (ySte != 0 && (y < 0 || y >= n || array[y][x] == WALL)) {
                x += -ySte;
                y += -ySte;
                xSte = -ySte;
                ySte = 0;
            }
        }

        return result;
    }
}



