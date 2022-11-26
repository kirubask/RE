package com.example.re.Modall;

import com.example.re.UserDetails;

public class Products{

    private String name;
    private String description;
    private int imageView;

    public Products(String name, String description, int imageView) {
        this.name = name;
        this.description = description;
        this.imageView = imageView;
    }

    public Products(UserDetails userDetails) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}

