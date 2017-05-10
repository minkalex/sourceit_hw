package com.source.it.lecture2.homework;

public class SwitchValues {
    public static void main(String[] args) {
        int first = 5;
        int second = 10;
        /*int temp = first;
        first = second;
        second = temp;*/

        first = first ^ second;//0101 ^ 1010 = 1111 - 15
        second = first ^ second;//1111 ^ 1010 = 0101 - 5
        first = first ^ second;//1111 ^ 0101 = 1010 - 10

        System.out.println("First = " + first + " , second = " + second);
    }
}
