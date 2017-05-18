package com.source.it.lecture3.homework;

public class YourOwnBinarySearch {
    static int[] array = {1, 4, 7, 10, 17, 30, 15};
    static int element = 30;

    public static void main(String[] args) {
        System.out.println(binarySearch(array, element));
    }


    private static int binarySearch(int[] array, int elem) {
        int result = -1;//нет такого значения
        int leftIndex = 0;
        int rightIndex = array.length;
        int middleIndex = 0;
        boolean sort = false;
        if (array != null) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i]<=array[i + 1]) {
                    sort = true;
                } else {
                    sort = false;
                    System.out.println("Array isn't sorted!");
                }
            }
            if (sort == true) {
                while (leftIndex < rightIndex) {
                    middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
                    if (elem == array[middleIndex]) {
                        result = middleIndex;
                        break;
                    } else {
                        if (elem <= array[middleIndex]) {
                            rightIndex = middleIndex;
                        } else {
                            leftIndex = middleIndex + 1;
                        }
                    }
                }
            }
        } else {
            System.out.println("Array is empty!");
        }
        return result;
    }
}
