package com.foodorder.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodorder.model.Contact;

public interface ContactDao extends JpaRepository<Contact,Integer> {
}
