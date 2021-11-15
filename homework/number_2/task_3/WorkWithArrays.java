package com.homework.number_2.task_3;

import java.util.Arrays;
import java.util.Random;

public class WorkWithArrays {
    public static void toFillingTwoArray(int[] arrayPositive, int[] arrayNegative) {
        Random random = new Random();

        int randomValue;

        while (true) {
            for (int i = 0; i < arrayPositive.length; ) {
                randomValue = random.nextInt();
                if (randomValue > 0) {
                    arrayPositive[i] = randomValue;
                    i++;
                }
            }

            for (int i = 0; i < arrayNegative.length; ) {
                randomValue = random.nextInt();
                if (randomValue < 0) {
                    arrayNegative[i] = randomValue;
                    i++;
                }
            }
            break;
        }
    }

    public static int[] toMergeArray(int[] arrayOne, int[] arrayTwo) {
        int[] array;

        if (arrayOne.length >= arrayTwo.length) {
            array = new int[arrayOne.length];
            System.arraycopy(arrayOne, 0, array, 0, arrayOne.length);

            for (int i = 0; i < arrayTwo.length; i++) {
                array[i] += arrayTwo[i];
            }

        } else {
            array = new int[arrayTwo.length];
            System.arraycopy(arrayTwo, 0, array, 0, arrayTwo.length);

            for (int i = 0; i < arrayOne.length; i++) {
                array[i] += arrayOne[i];
            }
        }
        return array;
    }

    public static void toString(String nameArray, int[] array) {
        System.out.print(nameArray);
        for (int q : array) {
            System.out.print(q + " ");
        }
        System.out.println();
    }
}
