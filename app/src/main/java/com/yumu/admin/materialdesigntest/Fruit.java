package com.yumu.admin.materialdesigntest;

/**
 * Created by admin on 2017/1/5.
 */

public class Fruit {
    public Fruit(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    private String name;

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  int imageId;

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
