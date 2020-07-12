package com.fastcampus.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<Restaurant> restaurants =new ArrayList<>();

    public RestaurantRepositoryImpl(){
        restaurants.add(new Restaurant(1004, "Bob", "Seoul"));
        restaurants.add(new Restaurant(2020, "CyberFood", "Seoul"));

    }
    @Override
    public List<Restaurant> findAll() {


        return restaurants;
    }

    @Override
    public Restaurant findById(int id) {
        return restaurants.stream()
                .filter(r -> r.getId()==id)
                .findFirst()
                .orElse(null);
    }
}
