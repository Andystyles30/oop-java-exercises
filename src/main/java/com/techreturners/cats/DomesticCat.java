package com.techreturners.cats;

public class DomesticCat extends CatObject {

    private String setting; 
    private int averageHeight; 

    public DomesticCat() {
        this.setting = "domestic";
        this.averageHeight = 23;
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
        return "Purrrrrrr";
    }
} 