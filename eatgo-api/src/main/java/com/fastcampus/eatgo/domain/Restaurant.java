package com.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final String location;
    private final long id;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(long id, String name, String location){
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

    public long getId() {
        return id;
    }
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for(MenuItem menuItem: menuItems){
            addMenuItem(menuItem);
        }
    }
}
