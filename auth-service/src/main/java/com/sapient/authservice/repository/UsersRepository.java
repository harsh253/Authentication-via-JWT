package com.sapient.authservice.repository;

import com.sapient.authservice.entities.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends MongoRepository<Users, String> {
    Users findByUsername(String username);
}
