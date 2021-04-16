package com.alexandrenunes.mongodbproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alexandrenunes.mongodbproject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

