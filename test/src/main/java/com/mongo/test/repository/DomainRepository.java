package com.mongo.test.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.test.model.Domain;

@Repository
public interface DomainRepository  extends MongoRepository<Domain, String> {

}
