package com.source.it.lecture3.homework;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 15, 10, -1, 8};
            for (int i = 1; i < array.length; i++) {
                int elem = array[i];
                int index;
                index = Arrays.binarySearch(array, 0, i, elem);// range - [0...i-1]; index form 1 to n
                if (index < 0) {
                    index = -1 * index - 1;
                }
                System.arraycopy(array, index, array, index + 1, i - index);
                array[index] = elem;
            }
        System.out.println(Arrays.toString(array));
    }
}
