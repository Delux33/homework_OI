package com.homework.number_4.task_1.fruits;

import com.homework.number_4.task_1.Fruit;

public class Apple extends Fruit {

    String[] color = new String[] {"red", "green", "yellow"};

    int random = (int) (Math.random() * 3);

    @Override
    public String toString() {
        return "It's an apple, color - " + color[random] + ", " + super.toString();
    }
}
