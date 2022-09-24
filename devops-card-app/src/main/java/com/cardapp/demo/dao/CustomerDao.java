package com.cardapp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardapp.demo.entities.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
    
}
