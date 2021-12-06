package com.homework.number_4.task_2.factories;

import com.homework.number_4.task_2.factories.fabric.AbstractFabric;
import com.homework.number_4.task_2.fruits.Pineapple;

public class LongPineapplesFactory extends AbstractFabric {

    @Override
    public Pineapple makeFruit() {
        Pineapple longPineapple = new Pineapple();

        while (longPineapple.getTailHeight() <= 10) {
            longPineapple = new Pineapple();
        }

        return longPineapple;
    }
}
