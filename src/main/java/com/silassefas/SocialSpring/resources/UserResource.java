package com.silassefas.SocialSpring.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silassefas.SocialSpring.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User jessica = new User("1", "Jessica Myrelly", "jessica@gmail.com");
		User luna = new User("2", "Luna Safira", "luna@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(jessica,luna));
		return ResponseEntity.ok().body(list);
	}
}
