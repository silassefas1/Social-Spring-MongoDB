package com.silassefas.SocialSpring.resources;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.silassefas.SocialSpring.domain.Post;
import com.silassefas.SocialSpring.resources.util.URL;
import com.silassefas.SocialSpring.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
	
	@Autowired
	private PostService service;
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post object = service.findById(id);
		return ResponseEntity.ok().body(object);
	}

	@GetMapping(value = "/titlesearch")
	public ResponseEntity<List<Post>> findByTitle(@RequestParam(defaultValue = "") String text){
		text = URL.decodeParam(text);
		List<Post> list = service.findByTitle(text);
		return ResponseEntity.ok().body(list);
	} 
	
	@GetMapping(value = "/fullsearch")
	public ResponseEntity<List<Post>> fullSearch(
			@RequestParam(defaultValue = "") String text,
			@RequestParam(defaultValue = "") String minDate,
			@RequestParam(defaultValue = "") String maxDate) {
		text = URL.decodeParam(text);
		Date min= URL.covertDate(minDate, new Date(0L));
		Date max = URL.covertDate(maxDate, new Date());
		
		
		List<Post> list = service.fullSearch(text, min,max);
		return ResponseEntity.ok().body(list);
	} 
	
	
}
