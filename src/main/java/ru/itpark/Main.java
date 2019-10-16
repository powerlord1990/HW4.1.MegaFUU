package ru.itpark;

import ru.itpark.model.TurnOn;

public class Main {
    public static void main(String[] args) {
        TurnOn look = new TurnOn(
                "Включайся. Смотри",
                650,
                30,
                1_200,
                true,
                999_999,
                300,
                30,
                "Кино и сериалы в Мегафон ТВ"
        );
    }
}
