package com.example.maimi.models;

/**
 * Created by minhtien on 8/3/2016.
 */
public class ScorePoints {
    private int idDrawable;
    private String text;

    public ScorePoints(int idDrawable, String text) {
        this.idDrawable = idDrawable;
        this.text = text;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public String getText() {
        return text;
    }
}
