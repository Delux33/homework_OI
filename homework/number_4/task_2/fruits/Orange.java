package com.homework.number_4.task_2.fruits;

import com.homework.number_4.task_2.Fruit;

public class Orange extends Fruit {

    private int peelThickness  = (int) (Math.random() * 21);

      public void setPeelThickness(int peelThickness) {
        this.peelThickness = peelThickness;
    }

    @Override
    public String toString() {
        return "It's an orange, peel thickness - " + peelThickness + ", " + super.toString();
    }
}
