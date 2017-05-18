package com.source.it.lecture3.homework;

import java.math.BigInteger;

public class MatrixMultiplier {
    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 5, 4, 1}
        };

        int[][] second = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 5, 1},
                {3, 4, 6}
        };
        BigInteger elem = BigInteger.valueOf(0);
        BigInteger[][] third = new BigInteger[first.length][first.length];
        if (first[0].length == second.length) {
            for (int i = 0; i < first.length; i++) {
                for (int n = 0; n < second[0].length; n++) {
                    for (int j = 0; j < first[0].length; j++) {
                        elem = elem.add(BigInteger.valueOf(first[i][j] * second[j][n]));
                        third[i][n] = elem;
                    }
                    elem = BigInteger.valueOf(0);
                }
            }
            for (int x = 0; x < first.length; x++) {
                for (int y = 0; y < first.length; y++) {

                    if (y == third[0].length - 1) {
                        System.out.println(third[x][y] + "]]");
                    }
                    if (y == 0) {
                        System.out.print("[[" + third[x][y] + ", ");
                    }
                    if (y != third[0].length - 1 & y != 0) {
                        System.out.format(third[x][y] + ", ");
                    }
                }
            }
        } else {
            System.out.println("Matrices aren't agreed!");
        }
    }
}
