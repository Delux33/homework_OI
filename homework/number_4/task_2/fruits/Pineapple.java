package com.homework.number_4.task_2.fruits;

import com.homework.number_4.task_2.Fruit;

public class Pineapple extends Fruit {

    private int tailHeight = 5 + (int) (Math.random() * 16);

    public int getTailHeight() {
        return tailHeight;
    }

    @Override
    public String toString() {
         return "It's a pineapple, tail height - " + tailHeight + ", " + super.toString();
    }
}
