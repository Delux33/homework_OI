package com.homework.number_4.task_2;

import com.homework.number_4.task_2.factories.GreenApplesFactory;
import com.homework.number_4.task_2.factories.LongPineapplesFactory;
import com.homework.number_4.task_2.factories.RedApplesFactory;
import com.homework.number_4.task_2.factories.ThinOrangeFactory;
import com.homework.number_4.task_2.factories.fabric.AbstractFabric;

import java.util.ArrayList;

public class Task_2 {

    public static void main(String[] args) {
        ArrayList<AbstractFabric> factories = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            factories.add(new Task_2().toAddRandomFactory());
        }

        Fruit[] fruits = new Fruit[20];

        int indFruits = 0;

        for (AbstractFabric factory : factories) {

            for (int q = 0; q < 2; q++) {
                fruits[indFruits + q] = factory.makeFruit();
            }
            indFruits += 2;
        }

        for (Fruit q : fruits) {
            System.out.println(q.toString());
        }
    }

        public AbstractFabric toAddRandomFactory () {
            ArrayList<AbstractFabric> allFactories = new ArrayList<>(4);

            allFactories.add(new GreenApplesFactory());
            allFactories.add(new LongPineapplesFactory());
            allFactories.add(new RedApplesFactory());
            allFactories.add(new ThinOrangeFactory());

            int random = (int) (Math.random() * 4);

            return allFactories.get(random);

        }
}

