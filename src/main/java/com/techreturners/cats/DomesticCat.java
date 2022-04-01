package com.techreturners.cats;

public class DomesticCat implements Cat {

    private boolean isAsleep;
    private String setting;
    private int averageHeight;

    public DomesticCat() {
        this.isAsleep = false;
        this.setting = "domestic";
        this.averageHeight = 23;
    }

    @Override
    public boolean isAsleep() { return isAsleep; }

    @Override
    public String getSetting() { return setting; }

    @Override
    public int getAverageHeight() { return averageHeight; }

    @Override
    public void goToSleep() { isAsleep = true; }

    @Override
    public void wakeUp() { isAsleep = false; }

    @Override
    public String eat() {
        int random = (int)(Math.random() * 100) + 1;
        if( (random % 2) == 0 ) {
            return "It will do I suppose";
        } else {
            return "Purrrrrrr";
        }
    }

}
