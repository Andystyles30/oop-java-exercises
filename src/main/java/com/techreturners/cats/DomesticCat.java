package com.techreturners.cats;

public class DomesticCat extends CatObject {

    private String setting; 

    public DomesticCat() {
        this.setting = "domestic";
        this.averageHeight = 23;
    }

    @Override
    public String getSetting() {
        return this.setting;
    }
} 