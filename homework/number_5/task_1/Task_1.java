package com.homework.number_5.task_1;

public class Task_1 {

    public static void main(String[] args) {
        String[] names = new String[] {
                "Дима", "Валера", "Антон",
                "Наташа", "Аркаша", "Маша",
                "Слава", "Данила", "Андрей", "Юля" };

        Person[] people = new Person[10];

        Season[] seasons = new Season[] { Season.SUMMER,
                                          Season.WINTER,
                                          Season.SPRING,
                                          Season.AUTUMN };

        for (int i = 0; i < people.length; i++) {
            int randomForPeople = (int) (Math.random() * 10);
            int randomForSeason = (int) (Math.random() * 4);
            people[i] = new Person (names[randomForPeople], seasons[randomForSeason]);
        }

        for (Person q : people) {
            System.out.println(q.favouriteGame());
        }
    }
}

