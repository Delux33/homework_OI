package com.homework.number_4.task_1;

import com.homework.number_4.task_1.fruits.Apple;
import com.homework.number_4.task_1.fruits.Orange;
import com.homework.number_4.task_1.fruits.Pineapple;

public class Fruit {

    int weight = 1 + (int) (Math.random() * 10);

    public Fruit getRandomFruit() {

        Fruit[] fruits = new Fruit[] { new Apple(),
                                       new Pineapple(),
                                       new Orange() };

        int random = (int) (Math.random() * 3);

        return fruits[random];
    }

    public String toString() {

        return "weight - " + weight;
    }
}
