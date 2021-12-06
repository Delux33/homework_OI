package com.homework.number_4.task_2.factories;

import com.homework.number_4.task_2.factories.fabric.AbstractFabric;
import com.homework.number_4.task_2.fruits.Orange;

public class ThinOrangeFactory extends AbstractFabric {

    @Override
    public Orange makeFruit() {
        Orange orange = new Orange();

        orange.setPeelThickness(1 + (int) (Math.random() * 5));

        return orange;
    }
}

