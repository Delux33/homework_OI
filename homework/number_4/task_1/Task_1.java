package com.homework.number_4.task_1;

public class Task_1 {

    public static void main(String[] args) {
        Fruit[] randomFruits = new Fruit[] { new Fruit().getRandomFruit(),
                                             new Fruit().getRandomFruit(),
                                             new Fruit().getRandomFruit(),
                                             new Fruit().getRandomFruit() };

        for (Fruit randomFruit : randomFruits) {
            System.out.println(randomFruit.toString());
        }
    }
}

