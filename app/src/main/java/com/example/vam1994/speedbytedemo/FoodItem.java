package com.example.vam1994.speedbytedemo;


public class FoodItem {

    private float rating;
    private String name;

    public FoodItem(float rating, String name){
        this.rating = rating;
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}