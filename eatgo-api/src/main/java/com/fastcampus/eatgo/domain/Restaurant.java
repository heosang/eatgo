package com.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final String location;
    private final int id;
    private List<MenuItem> menuItems = new ArrayList<com.fastcampus.eatgo.domain.MenuItem>();

    public Restaurant(int id, String name, String location){
        this.id=id;
        this.name=name;
        this.location=location;
    }

    public String getName() {
        return name;
    }
    public String getInformation(){
        return name +" in "+ location;

    }

    public String getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }
    public List<com.fastcampus.eatgo.domain.MenuItem> getMenuItems(){
        return menuItems;
    }

    public void addMenuItem(com.fastcampus.eatgo.domain.MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItems(List<com.fastcampus.eatgo.domain.MenuItem> menuItems) {
        for(com.fastcampus.eatgo.domain.MenuItem menuItem: menuItems){
            addMenuItem(menuItem);
        }
    }
}
