package com.homework.number_4.task_2.factories;

import com.homework.number_4.task_2.factories.fabric.AbstractFabric;
import com.homework.number_4.task_2.fruits.Apple;

public class GreenApplesFactory extends AbstractFabric {

    @Override
    public Apple makeFruit() {
        Apple greenApple = new Apple();

        greenApple.setRandom(1);

        return greenApple;
    }
}

