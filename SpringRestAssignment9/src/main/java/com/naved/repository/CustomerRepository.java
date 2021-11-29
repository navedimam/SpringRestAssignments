package com.naved.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naved.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Integer>{

}
