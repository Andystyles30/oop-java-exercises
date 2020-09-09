package com.techreturners.cats;

public class CheetahCat extends CatObject {

    private String setting; 
    private int averageHeight; 

    public CheetahCat() {
        this.setting = "wild";
        this.averageHeight = 900;
    }

    @Override
    public String getSetting() {
        return this.setting;
    }

    @Override
    public int getAverageHeight() {
        return this.averageHeight;
    }
} 