package ru.itpark.model;

public class OtherTariff extends Tariff {
    private int internetLimit;
    private boolean unlimitedInternet;
    private boolean unlimitedCall;
    private boolean secondBilling;

    public OtherTariff(String name, int price, int period, int internetLimit, boolean unlimitedInternet, boolean unlimitedCall, boolean secondBilling) {
        super(name, price, period);
        this.internetLimit = internetLimit;
        this.unlimitedInternet = unlimitedInternet;
        this.unlimitedCall = unlimitedCall;
        this.secondBilling = secondBilling;
    }

    public int getInternetLimit() {
        return internetLimit;
    }

    public void setInternetLimit(int internetLimit) {
        this.internetLimit = internetLimit;
    }

    public boolean isUnlimitedInternet() {
        return unlimitedInternet;
    }

    public void setUnlimitedInternet(boolean unlimitedInternet) {
        this.unlimitedInternet = unlimitedInternet;
    }

    public boolean isUnlimitedCall() {
        return unlimitedCall;
    }

    public void setUnlimitedCall(boolean unlimitedCall) {
        this.unlimitedCall = unlimitedCall;
    }

    public boolean isSecondBilling() {
        return secondBilling;
    }

    public void setSecondBilling(boolean secondBilling) {
        this.secondBilling = secondBilling;
    }

    @Override
    public String toString() {
        return "Other{" +
                "internetLimit=" + internetLimit +
                ", unlimitedInternet=" + unlimitedInternet +
                ", unlimitedCall=" + unlimitedCall +
                ", secondBilling=" + secondBilling +
                '}';
    }
}
