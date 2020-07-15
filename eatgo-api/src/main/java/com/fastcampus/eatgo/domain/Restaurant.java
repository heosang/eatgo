package com.fastcampus.eatgo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Restaurant {
    private String name;
    private String address;
    @Id
    private long id;
    @Transient
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(){

    }

    public Restaurant(String name, String address) {
        this.name=name;
        this.address=address;
    }

    public Restaurant(long id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public void setId(long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getInformation(){
        return name +" in "+ address;
    }

    public String getAddress() {
        return address;
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
