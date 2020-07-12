package com.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RestaurantTest {
    @Test
    public void creation(){
        Restaurant restaurant=new Restaurant(1004L,"Bob","Seoul");
        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob"));
        assertThat(restaurant.getLocation(),is("Seoul"));
    }
    @Test
    public void information(){
        Restaurant restaurant=new Restaurant(1004L, "Bob", "Seoul");
        assertThat(restaurant.getInformation(), is("Bob in Seoul"));
    }

}