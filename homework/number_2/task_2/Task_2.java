package com.homework.number_2.task_2;

public class Task_2 {

    public static void main(String[] args) {
        int[] array = new int[5];

        WorkWithArray.toFillingArray(array);

        System.out.print("Array elements: ");
        WorkWithArray.toString(array);

        int[] evenArray = WorkWithArray.separationToEven(array);
        int[] oddArray = WorkWithArray.separationToOdd(array);

        System.out.print("\nEven array elements: ");
        WorkWithArray.toString(evenArray);

        System.out.print("\nOdd array elements: ");
        WorkWithArray.toString(oddArray);

        System.out.println("\nAverage value from even array: " +
                                     WorkWithArray.averageValue(evenArray));
        System.out.print("Average value from odd array: " +
                                     WorkWithArray.averageValue(oddArray));
    }
}
