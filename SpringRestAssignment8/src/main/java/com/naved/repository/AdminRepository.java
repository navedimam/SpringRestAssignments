package com.naved.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naved.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
