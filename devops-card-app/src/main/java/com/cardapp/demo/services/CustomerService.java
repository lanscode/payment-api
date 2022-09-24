package com.cardapp.demo.services;

import java.util.List;

import com.cardapp.demo.entities.Customer;

public interface CustomerService {
    void save(Customer customer);
    List<Customer>  getAllCustomers();

    
}
