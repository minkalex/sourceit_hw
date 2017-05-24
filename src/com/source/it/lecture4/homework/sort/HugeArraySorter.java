package com.source.it.lecture4.homework.sort;

import java.util.Arrays;

public class HugeArraySorter {
    public static void main(String[] args) {
        int[] hugeArray = ArrayCreator.createHugeArray(10);

        System.out.println(Arrays.toString(hugeArray));
        int [] someArray = new int[10];
        int min = 9;
        int max = 0;
        int n = 0;
        for (int i = 0; i < hugeArray.length; i++) {
            someArray[hugeArray[i]]++;
            if (hugeArray[i] < min) {
                min = hugeArray[i];
            }
            if (hugeArray[i] > max) {
                max = hugeArray[i];
            }
        }
        for (int i = min; i <= max; i++) {
            for (int j = 1; j <= someArray[i]; j++) {
                hugeArray[n] = i;
                n++;
            }
        }

        System.out.println(Arrays.toString(hugeArray));

        for (int index = 0; index < hugeArray.length - 1; index++) {
            if (hugeArray[index] > hugeArray[index + 1]) {
                System.out.println("Sort failed!!!");
                return;
            }
        }

        System.out.println("Sort successful!!");
    }
}
