package com.fastcampus.eatgo.domain;


public class MenuItem {
    private final String name;

    public MenuItem(String name){
        this.name=name;
    }
    public String getMenu(){
        return name;
    }
}
