package ru.itpark.model;

public class Tariff {
    private String name;
    private int price;
    private int period;
    public static final int year=365;

    public Tariff(String name, int price, int period) {
        this.name = name;
        this.price = price;
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", period=" + period +
                '}';
    }
}