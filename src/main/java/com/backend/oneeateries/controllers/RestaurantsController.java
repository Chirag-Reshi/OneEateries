package com.backend.oneeateries.controllers;

import com.backend.oneeateries.Model.MenuItem;
import com.backend.oneeateries.Model.Restaurant;
import com.backend.oneeateries.Repositories.RestaurantsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/restaurant/")
public class RestaurantsController {
    @Autowired
    private RestaurantsRepository repository;
    @GetMapping("/")
    public List<Restaurant> getAllRestaurant(){
        log.info(repository.restaurantList.toString());
        return repository.restaurantList;
    }
    @PostMapping("/")
    public void addRestaurant(@Validated @RequestBody Restaurant restaurant){
        log.info(repository.addRestaurant(restaurant));
    }

    @GetMapping("/{id}/menu/")
    public List<MenuItem> getAllMenuItem(@PathVariable("id")String restaurantId){
        List<MenuItem> menus = repository.getMenu(restaurantId);
        log.info(menus.toString());
        return menus;
    }

    @PostMapping("/{id}/menu/")
    public void addMenu(@PathVariable("id")String restaurantId, @Validated @RequestBody List<MenuItem> menuItems){
        log.info(repository.addMenu(restaurantId,menuItems));
    }
}