package com.source.it.lecture2.homework;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;//a
        int x2 = 10, y2 = 7;//b
        int x3 = -3, y3 = 4;//c
        float length = 0;
        float square = 0;

        double ab = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        double bc = Math.abs(Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
        double ac = Math.abs(Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)));
        length = (float) (ab + bc + ac);
        square = (float) 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));


        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
