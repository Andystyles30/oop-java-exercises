package com.techreturners.cats;

public class LionCat extends CatObject {

    private String setting; 
    private int averageHeight; 

    public LionCat() {
        this.setting = "wild";
        this.averageHeight = 1100;
    }

    @Override
    public String getSetting() {
        return this.setting;
    }

    @Override
    public int getAverageHeight() {
        return this.averageHeight;
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }
} 