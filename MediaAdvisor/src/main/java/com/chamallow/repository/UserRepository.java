package com.chamallow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chamallow.document.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
