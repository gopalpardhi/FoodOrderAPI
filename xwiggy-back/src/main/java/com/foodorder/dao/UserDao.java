package com.foodorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodorder.model.User;

public interface UserDao extends JpaRepository<User,String> {
}
