package com.naved.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naved.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
