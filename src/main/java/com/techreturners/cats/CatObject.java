package com.techreturners.cats;

abstract class CatObject implements Cat {

    private Boolean asleep;
    private String setting;

    public CatObject() {
        this.asleep = false;
        this.setting = "cat";
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
    
    public String getSetting() {
        return this.setting;
    }
}