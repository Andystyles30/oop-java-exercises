package com.techreturners.cats;

abstract class CatObject implements Cat {

    private Boolean asleep;

    public CatObject() {
        this.asleep = false;
    }

    public Boolean isAsleep() {
        return this.asleep;
    }

    public void goToSleep() {
        this.asleep = true;
    }

    public void wakeUp() {
        this.asleep = false;
    }  
}