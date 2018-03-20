package com.lbstestprogram.shixiaoming.materialdesigntest;

/**
 * Created on 2018/3/14 20:57
 *
 * @Author xiaoming
 * @emile xiaoming3C@126.com
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;

    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
