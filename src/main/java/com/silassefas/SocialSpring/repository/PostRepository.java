package com.silassefas.SocialSpring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.silassefas.SocialSpring.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}