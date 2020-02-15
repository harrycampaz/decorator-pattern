package com.dezzapps.decoradorpattern.models.bread;

public abstract class Bread {

    String description;
    int kcal;

    public String getDescription() {
        return this.description;
    }

    public int getKcal() {
        return kcal;
    }
}
