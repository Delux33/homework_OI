package com.homework.number_2.task_2;

public class Task_2 {

    public static void main(String[] args) {
        int[] array = new int[5];

        WorkWithArrays.toFillingArray(array);

        System.out.print("Array elements: ");
        WorkWithArrays.toString(array);

        int[] evenArray = WorkWithArrays.separationToEven(array);
        int[] oddArray = WorkWithArrays.separationToOdd(array);

        System.out.print("\nEven array elements: ");
        WorkWithArrays.toString(evenArray);

        System.out.print("\nOdd array elements: ");
        WorkWithArrays.toString(oddArray);

        System.out.println("\nAverage value from even array: " +
                                     WorkWithArrays.averageValue(evenArray));
        System.out.print("Average value from odd array: " +
                                     WorkWithArrays.averageValue(oddArray));
    }
}
