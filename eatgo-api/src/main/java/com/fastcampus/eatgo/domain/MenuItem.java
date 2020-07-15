package com.fastcampus.eatgo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MenuItem {
    @Id
    private long id;
    private long restaurantId;
    private final String name;

    public MenuItem(String name){
        this.name=name;
    }
    public String getMenu(){
        return name;
    }
}
