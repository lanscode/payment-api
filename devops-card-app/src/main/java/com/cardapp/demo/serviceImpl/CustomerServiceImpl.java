package com.cardapp.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardapp.demo.dao.CustomerDao;
import com.cardapp.demo.entities.Customer;
import com.cardapp.demo.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao dao;

    @Override
    public void save(Customer customer) {
        dao.save(customer);
        
    }

    @Override
    public List<Customer> getAllCustomers() {  
        return (List<Customer>) dao.findAll();
    }
    
}
