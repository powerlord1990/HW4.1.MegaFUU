package ru.itpark.model;

public class Tariff {
    private int id;
    private String name;
    private int price;
    private int period;
    public static final int year=365;


    public Tariff(int id, String name, int price, int period) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.period = period;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    }