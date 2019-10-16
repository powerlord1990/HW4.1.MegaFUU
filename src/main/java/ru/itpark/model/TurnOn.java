package ru.itpark.model;

public class TurnOn extends Tariff {
    private int minutes;
    private boolean unlimitedInternet;
    private int internetLimit;
    private int sms;
    private int cashbackLimit;
    private String features;

    public TurnOn(String name, int price, int period, int minutes, boolean unlimitedInternet, int internetLimit, int sms, int cashbackLimit, String features) {
        super(name, price, period);
        this.minutes = minutes;
        this.unlimitedInternet = unlimitedInternet;
        this.internetLimit = internetLimit;
        this.sms = sms;
        this.cashbackLimit = cashbackLimit;
        this.features = features;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    public int getInternetLimit() {
        return internetLimit;
    }

    public void setInternetLimit(int internetLimit) {
        this.internetLimit = internetLimit;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getCashbackLimit() {
        return cashbackLimit;
    }

    public void setCashbackLimit(int cashbackLimit) {
        this.cashbackLimit = cashbackLimit;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "TurnOn{" +
                "minutes=" + minutes +
                ", unlimitedInternet=" + unlimitedInternet +
                ", internetLimit=" + internetLimit +
                ", sms=" + sms +
                ", cashbackLimit=" + cashbackLimit +
                ", features='" + features + '\'' +
                '}';
    }
}