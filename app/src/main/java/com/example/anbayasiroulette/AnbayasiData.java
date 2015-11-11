package com.example.anbayasiroulette;

/**
 * Created by xxxxxx on 2015/11/11.
 */
public class AnbayasiData {
    private int number;
    private int addition;
    private String comment;

    public AnbayasiData(int number,int addition,String comment){
        this.number = number;
        this.addition = addition;
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAddition() {
        return addition;
    }

    public void setAddition(int addition) {
        this.addition = addition;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
