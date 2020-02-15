package com.dezzapps.decoradorpattern.models.bread;

public class Butter extends BreadDecorator {

    private Bread bread;

    public Butter(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDescription() {
        return this.bread.getDescription() + "Con Mantequilla";
    }

    @Override
    public int getKcal() {
        return this.bread.getKcal() + 20;
    }
}


