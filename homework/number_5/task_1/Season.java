package com.homework.number_5.task_1;

public enum Season {
    SUMMER,
    AUTUMN,
    SPRING,
    WINTER;

    public String seasonGame(Season season) {
        Games game;

        switch (season) {
            case SUMMER -> {
                game = Games.PLUCKING;
                return "собирание и поедание ягод";
            }
            case SPRING -> {
                game = Games.BOATS;
                return "запуск корабликов по ручьям";
            }
            case WINTER -> {
                game = Games.SNOWBALLS;
                return "снежки";
            }
            case AUTUMN -> {
                game = Games.PUDDLE_MEASUREMENT;
                return "измерение глубины луж методом \"сапога\"";
            }
        }
       return "Not correct season";
    }
}

