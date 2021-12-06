package com.homework.number_4.task_1.fruits;

import com.homework.number_4.task_1.Fruit;

public class Orange extends Fruit {

    public int peelThickness  = (int) (Math.random() * 21);

    @Override
    public String toString() {
        return "It's an orange, peel thickness - " + peelThickness + ", " + super.toString();
    }
}
