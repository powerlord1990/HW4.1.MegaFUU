package ru.itpark.model;

public class ForRouterTariff extends Tariff {
    private boolean unlimitedInternet;

    public ForRouterTariff(int id, String name, int price, int period, boolean unlimitedInternet) {
        super(id, name, price, period);
        this.unlimitedInternet = unlimitedInternet;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    @Override
    public String toString() {
        return "ForRouthers{" +
                "unlimitedInternet=" + unlimitedInternet +
                '}';
    }
}
