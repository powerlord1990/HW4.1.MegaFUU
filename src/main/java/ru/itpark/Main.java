package ru.itpark;

import ru.itpark.model.ForRoutherTariff;
import ru.itpark.model.OtherTariff;
import ru.itpark.model.Tariff;
import ru.itpark.model.TurnOnTariff;

public class Main {
    public static void main(String[] args) {
        TurnOnTariff look = new TurnOnTariff(
                1,
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

        ForRoutherTariff yourUnlim = new ForRoutherTariff(
                1,
                "Твой безлимит на 6 месяцев",
                3100,
                Tariff.year / 2,
                true
        );

        OtherTariff hello = new OtherTariff(
                2,
                "#Hello",
                750,
                14,
                30,
                false,
                true,
                false
        );

        System.out.println(look.toString());
    }
}
