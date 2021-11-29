package com.naved.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naved.model.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}
