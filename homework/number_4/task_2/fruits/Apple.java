package com.homework.number_4.task_2.fruits;

import com.homework.number_4.task_2.Fruit;

public class Apple extends Fruit {

    private String[] color = new String[] {"red", "green", "yellow"};

    private int random = (int) (Math.random() * 3);

    public void setRandom(int random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "It's an apple, color - " + color[random] + ", " + super.toString();
    }
}
