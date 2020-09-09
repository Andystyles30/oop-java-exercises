package com.techreturners.cats;
import java.util.Random;

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
        return getRandomComment();
    }

    private static String getRandomComment() {
        String[] random_comment = {"Purrrrrrr", "It will do I suppose"};
        int rnd = new Random().nextInt(random_comment.length);
        return random_comment[rnd];
    }
} 