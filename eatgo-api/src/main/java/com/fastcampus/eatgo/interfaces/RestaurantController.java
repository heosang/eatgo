package com.fastcampus.eatgo.interfaces;

import com.fastcampus.eatgo.application.RestaurantService;
import com.fastcampus.eatgo.domain.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {


    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        return restaurants;
    }
    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") long id){
        Restaurant restaurant = restaurantService.getRestaurant(id);
        //기본정보 + 메뉴정보

       /* Restaurant restaurant = restaurantRepository.findById(id);

        List<MenuItem> menuItems=menuItemRepository.findAllByRestaurantId(id);
        restaurant.setMenuItems(menuItems);*/
        return restaurant;
    }
}
