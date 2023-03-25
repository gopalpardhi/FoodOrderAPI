package com.foodorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodorder.model.Cart;

public interface CartDao extends JpaRepository<Cart,Integer> {
}
