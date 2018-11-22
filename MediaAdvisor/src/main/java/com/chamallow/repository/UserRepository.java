package com.chamallow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.chamallow.document.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

}
