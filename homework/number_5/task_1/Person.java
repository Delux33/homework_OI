package com.homework.number_5.task_1;

public class Person {
    private final String name;
    private final Season season;


    public Person(String name, Season season) {
        this.name = name;
        this.season = season;
    }

    public String favouriteGame() {
        return name + " - любимая игра " + season.seasonGame(season);
    }
}
