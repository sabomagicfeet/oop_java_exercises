package com.techreturners.cats;

public class LionCat implements Cat {
    private boolean isAsleep;
    private String setting;
    private int averageHeight;

    public LionCat() {
        this.isAsleep = false;
        this.setting = "wild";
        this.averageHeight = 1100;
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public void goToSleep() { isAsleep = true; }

    @Override
    public void wakeUp() { isAsleep = false; }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    @Override
    public String eat() { return "Roar!!!!"; }

}
