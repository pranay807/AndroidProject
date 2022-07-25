package com.example.modernfurniture;

import java.io.Serializable;

public class Products implements Serializable {
    private String name,type,imageUrl;
    private double price;

    public Products(){}

    public Products(String name, String type, String imageUrl, double price){
        this.name = name;
        this.type = type;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getPrice() {
        return price;
    }



}
