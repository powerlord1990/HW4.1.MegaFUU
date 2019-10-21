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


        System.out.println(look.toString());
    }
}