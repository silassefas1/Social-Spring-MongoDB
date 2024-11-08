package com.silassefas.SocialSpring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.silassefas.SocialSpring.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
