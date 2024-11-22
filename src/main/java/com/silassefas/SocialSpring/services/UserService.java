package com.silassefas.SocialSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silassefas.SocialSpring.domain.User;
import com.silassefas.SocialSpring.dto.UserDTO;
import com.silassefas.SocialSpring.repository.UserRepository;
import com.silassefas.SocialSpring.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User object) {
		return repository.insert(object);
	}
	
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	
	public User fromDTO(UserDTO objectDTO) {
		return new User(objectDTO.getId(), objectDTO.getName(), objectDTO.getEmail());
	}
	


}
