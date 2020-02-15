package com.dezzapps.decoradorpattern.models.bread;

public class Oil extends BreadDecorator {

    private Bread bread;

    public Oil(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return this.bread.getDescription() + " Con Aceite";
    }

    @Override
    public int getKcal() {
        return this.bread.getKcal() + 30;
    }
}


