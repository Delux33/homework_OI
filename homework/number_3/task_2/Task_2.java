package com.homework.number_3.task_2;

public class Task_2 {

    public static void main(String[] args) {

        System.out.println(new SequentialRandom().getVal());
        System.out.println(new SequentialRandom().getVal());
        System.out.println(new SequentialRandom().getVal());

        SequentialRandom.resetRandom();

        System.out.println(new SequentialRandom().getVal());
        System.out.println(new SequentialRandom().getVal());
        System.out.println(new SequentialRandom().getVal());
    }
}
