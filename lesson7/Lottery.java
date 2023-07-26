package com.gmail.anyakeba.homeworks.lesson7;

import java.util.Arrays;

public class Lottery {

    private static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public static int countMatch(int[] array, int[] array1) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j && array[i] == array1[j]) {
                    count++;
                }
            }
        }
        System.out.println("Matches " + count);
        return count;
    }

    public static void sort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
                    } while (swapped);
    }



    public static void main(String[] args) {
        int[] organizatorsNumbers = generate(7);
        int[] playersNumbers = generate(7);

        System.out.println(Arrays.toString(organizatorsNumbers));
        System.out.println(Arrays.toString(playersNumbers));

        sort(organizatorsNumbers);
        sort(playersNumbers);

        System.out.println(Arrays.toString(organizatorsNumbers));
       System.out.println(Arrays.toString(playersNumbers));

        countMatch(organizatorsNumbers, playersNumbers);
    }
}


