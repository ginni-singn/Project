package com.mongo.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.test.model.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
