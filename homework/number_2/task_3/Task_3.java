package com.homework.number_2.task_3;

public class Task_3 {

    public static void main(String[] args) {
        int[] arrayOne = new int[7];
        int[] arrayTwo = new int[7];

        WorkWithArrays.toFillingTwoArray(arrayOne, arrayTwo);

        WorkWithArrays.toString("First array: ", arrayOne);
        WorkWithArrays.toString("Second array: ", arrayTwo);

        int[] arrayThree;

        arrayThree = WorkWithArrays.toMergeArray(arrayOne, arrayTwo);

        WorkWithArrays.toString("Third array: ", arrayThree);
    }
}
