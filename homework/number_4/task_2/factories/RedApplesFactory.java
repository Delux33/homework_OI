package com.homework.number_4.task_2.factories;

import com.homework.number_4.task_2.factories.fabric.AbstractFabric;
import com.homework.number_4.task_2.fruits.Apple;

public class RedApplesFactory extends AbstractFabric {

    @Override
    public Apple makeFruit() {
        Apple redApple = new Apple();

        redApple.setRandom(0);

        return redApple;
    }
}

