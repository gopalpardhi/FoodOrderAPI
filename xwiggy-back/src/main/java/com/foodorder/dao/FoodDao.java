package com.foodorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodorder.model.Food;


public interface FoodDao extends JpaRepository<Food,String> {

}
