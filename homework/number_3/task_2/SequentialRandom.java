package com.homework.number_3.task_2;

import java.util.Random;

public class SequentialRandom {
    Random random = new Random();
    private int val;
    public static int currentValue;

    public SequentialRandom() {
        if (currentValue == 0) {
            val = random.nextInt();
            currentValue = val;
        } else {
            val = ++currentValue;
        }
    }

    public static void resetRandom() {
        currentValue = 0;
    }

    public int getVal() {
        return val;
    }
}
