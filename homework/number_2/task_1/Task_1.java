package com.homework.number_2.task_1;

import java.util.Random;

public class Task_1 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];

        int sum = 0;
        int minElement = array[0];
        int minIndex = 0;

        System.out.print("Array elements: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

            System.out.print(array[i] + " ");

            sum += array[i];

            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }

        System.out.format("\n" +
                "Sum of elements: %s\n" +
                "The minimum value: %s\n" +
                "His index: %s",
                sum, minElement, minIndex);
    }
}
