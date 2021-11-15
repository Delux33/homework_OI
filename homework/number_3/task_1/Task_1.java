package com.homework.number_3.task_1;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {

    public static void main(String[] args) {
        String[] firstName = new String[5];
        String[] lastName = new String[6];
        Person[] person = new Person[50];

        Random random = new Random();

        firstName[0] = "Иван";
        firstName[1] = "Петр";
        firstName[2] = "Григорий";
        firstName[3] = "Дмитрий";
        firstName[4] = "Наталья";

        lastName[0] = "Иванов";
        lastName[1] = "Петров";
        lastName[2] = "Григорьевич";
        lastName[3] = "Дмитриевич";
        lastName[4] = "Натальевна";
        lastName[5] = "Семенова";

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(firstName[random.nextInt(firstName.length)],
                    lastName[random.nextInt(lastName.length)]);
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println("Человек №" + i + " - " + person[i].toString());
        }
    }
}
