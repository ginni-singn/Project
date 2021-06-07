package com.mongo.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.test.model.Employees;

@Repository
public interface EmployeesRepository extends MongoRepository<Employees, String> {

}
