package ru.itpark.model;

public class forRouthers extends Tariff {
    private boolean unlimitedInternet;

    public forRouthers(String name, int price, int period, boolean unlimitedInternet) {
        super(name, price, period);
        this.unlimitedInternet = unlimitedInternet;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }
}
