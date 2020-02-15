package com.dezzapps.decoradorpattern.models.filling;

public abstract class Filling {
    String description;
    int kcal;

    public String getDescription() {
        return this.description;
    }

    public int getKcal() {
        return kcal;
    }
}
