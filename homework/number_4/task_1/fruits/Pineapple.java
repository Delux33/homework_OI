package com.homework.number_4.task_1.fruits;

import com.homework.number_4.task_1.Fruit;

public class Pineapple extends Fruit {

    int tailHeight = 5 + (int) (Math.random() * 16);

    @Override
    public String toString() {
         return "It's a pineapple, tail height - " + tailHeight + ", " + super.toString();
    }
}
