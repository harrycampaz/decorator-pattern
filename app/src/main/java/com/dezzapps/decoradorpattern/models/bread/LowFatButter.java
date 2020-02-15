package com.dezzapps.decoradorpattern.models.bread;

public class LowFatButter extends BreadDecorator {

    private Bread bread;

    public LowFatButter(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return this.bread.getDescription() + " Con Baja en Grasa";
    }

    @Override
    public int getKcal() {
        return this.bread.getKcal() + 10;
    }
}

