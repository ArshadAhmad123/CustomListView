package com.android.customlistview.Model;

public class Model {

    private int Image;
    private String Name;

    public Model(String name,int image) {
        Image = image;
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
