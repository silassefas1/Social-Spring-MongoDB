package com.silassefas.SocialSpring.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silassefas.SocialSpring.domain.User;
import com.silassefas.SocialSpring.dto.UserDTO;
import com.silassefas.SocialSpring.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		List<User> list = service.findAll();
		List<UserDTO> listDto = list.stream().map(usuario -> new UserDTO(usuario)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
