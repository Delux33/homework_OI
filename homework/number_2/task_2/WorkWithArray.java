package com.homework.number_2.task_2;

import java.util.ArrayList;
import java.util.Random;

public class WorkWithArray {
    public static void toFillingArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }

    public static int[] separationToEven(int[] sourceArray) {
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i : sourceArray) {
            if ((i % 2) == 0) {
                evenList.add(i);
            }
        }
        int[] evenArray = new int[evenList.size()];

        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = evenList.get(i);
        }
        return evenArray;
    }

    public static int[] separationToOdd(int[] sourceArray) {
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i : sourceArray) {
            if ((i % 2) != 0) {
                oddList.add(i);
            }
        }
        int[] oddArray = new int[oddList.size()];

        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = oddList.get(i);
        }
        return oddArray;
    }

    public static int averageValue(int[] array) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for(int i : array) {
            sum += i;
            if (i != 0) {
                count++;
            }
        }
        if (count != 0) {
            average = sum / count;
        }
        return average;
    }

    public static void toString(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
