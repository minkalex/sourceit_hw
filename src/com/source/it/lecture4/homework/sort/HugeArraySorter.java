package com.source.it.lecture4.homework.sort;

import java.util.Arrays;

public class HugeArraySorter {
    public static void main(String[] args) {
        int[] hugeArray = ArrayCreator.createHugeArray(10);

        System.out.println(Arrays.toString(hugeArray));
        int [] counterArray = new int[10];
        int min = 9;
        int max = 0;
        int position = 0;
        for (int i = 0; i < hugeArray.length; i++) {
            if (hugeArray[i] >= 0 && hugeArray[i] < 10) {
                counterArray[hugeArray[i]]++;
                if (hugeArray[i] < min) {
                    min = hugeArray[i];
                }
                if (hugeArray[i] > max) {
                    max = hugeArray[i];
                }
            } else {
                System.out.println("Argument of createHugeArray > 10!");
                System.exit(0);
            }
        }
        for (int i = min; i <= max; i++) {
            for (int j = 1; j <= counterArray[i]; j++) {
                hugeArray[position] = i;
                position++;
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
