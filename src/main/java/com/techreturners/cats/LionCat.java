package com.techreturners.cats;

public class LionCat extends CatObject {

    private String setting; 

    public LionCat() {
        this.setting = "wild";
    }

    @Override
    public String getSetting() {
        return this.setting;
    }
} 