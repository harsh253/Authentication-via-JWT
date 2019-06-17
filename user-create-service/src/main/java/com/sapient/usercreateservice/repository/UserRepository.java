package com.sapient.usercreateservice.repository;

import com.sapient.usercreateservice.entities.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users, Integer> {
}
