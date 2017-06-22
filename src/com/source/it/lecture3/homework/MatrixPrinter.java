package com.source.it.lecture3.homework;

public class MatrixPrinter {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2000, 3,    4},
            {3, 4,    5250, 60000000},
            {7, 5,    4,    1}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == array[0].length - 1) {
                    System.out.format("%11d]]%n", array[i][j]);
                }
                if (j == 0) {
                    System.out.format("[[%11d,", array[i][j]);
                }
                if (j != array[0].length - 1 & j != 0) {
                    System.out.format("%11d,", array[i][j]);
                }
            }
        }
    }
}
