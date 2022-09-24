package com.cardapp.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardapp.demo.entities.Customer;
import com.cardapp.demo.services.CustomerService;

@RestController
public class CustomerController {

    @Autowired   
    private CustomerService service;
    
    @GetMapping(path = "/customers/add")
    public ResponseEntity<Customer> save(){
        Customer c = new Customer();
        c.setIden("003");
        c.setName("herman");
        service.save(c);
        return new ResponseEntity<Customer>(c, HttpStatus.OK);
    }

    @GetMapping(path = "/customers/all")
    public ResponseEntity<List<Customer>> findAll(){
        return new ResponseEntity<List<Customer>>(service.getAllCustomers(), HttpStatus.OK);
    }
    
}
