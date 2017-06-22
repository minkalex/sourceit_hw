package com.source.it.lecture3.homework;


import java.util.Arrays;

public class MatrixInverter {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {7, 7, 4, 1},
                {7, 5, 4, 1}
        };
        int[][] invertedMatrix = new int [array.length][array.length];
        boolean square = false;
        for (int n = 0; n < array.length; n++) {
            if (array.length == array[n].length) {
                square = true;
            } else {
                square = false;
                break;
            }
        }
        if (square) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (i == j) {
                        invertedMatrix[i][j] = array[i][j];
                    } else {
                        invertedMatrix[i][j] = array[j][i];
                    }
                }
            }
            for (int i = 0; i < invertedMatrix.length; i++) {
                for (int j = 0; j < invertedMatrix[0].length; j++) {
                    if (j == invertedMatrix[0].length - 1) {
                        System.out.format("%11d]]%n", invertedMatrix[i][j]);
                    }
                    if (j == 0) {
                        System.out.format("[[%11d,", invertedMatrix[i][j]);
                    }
                    if (j != invertedMatrix[0].length - 1 & j != 0) {
                        System.out.format("%11d,", invertedMatrix[i][j]);
                    }
                }
            }
        } else {
            System.out.println("Matrix isn't square!");
        }
    }
}