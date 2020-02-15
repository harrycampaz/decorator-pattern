package com.dezzapps.decoradorpattern.models.filling;

public class DoblePortion extends FillingDecorator {

    private  Filling filling;

    public DoblePortion(Filling filling) {
        this.filling = filling;
    }

    @Override
    public String getDescription() {
        return " Racion doble de "+ filling.getDescription();
    }

    @Override
    public int getKcal() {
        return filling.getKcal() * 2;
    }
}
