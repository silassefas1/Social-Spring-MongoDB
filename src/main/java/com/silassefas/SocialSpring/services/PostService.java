package com.silassefas.SocialSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silassefas.SocialSpring.domain.Post;
import com.silassefas.SocialSpring.repository.PostRepository;
import com.silassefas.SocialSpring.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	
	public Post findById(String id) {
		Optional<Post> object = repository.findById(id);
		return object.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
		
	public List<Post> findByTitle(String text){
		return repository.findByTitleContainingIgnoreCase(text);
	}


}
