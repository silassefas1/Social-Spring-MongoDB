package com.silassefas.SocialSpring.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.silassefas.SocialSpring.domain.Post;
import com.silassefas.SocialSpring.domain.User;
import com.silassefas.SocialSpring.dto.AuthorDTO;
import com.silassefas.SocialSpring.dto.CommentDTO;
import com.silassefas.SocialSpring.repository.PostRepository;
import com.silassefas.SocialSpring.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User jessica = new User(null, "Jessica Myrelly", "jessica@gmail.com");
		User luna = new User(null, "Luna Safira", "luna@gmail.com");
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(jessica, luna, maria, alex, bob));
		
		Post post1 = new Post(null, simpleDateFormat.parse("21/03/2018"),"Partiu viagem", "Vou Viajar para São Paulo. Abrços!", new AuthorDTO(jessica));
		Post post2 = new Post(null, simpleDateFormat.parse("21/03/2018"),"Bom Dia", "Acordei Feliz Hoje!", new AuthorDTO(jessica));
		
		CommentDTO comment1 = new CommentDTO("Boa Viagem mano!",simpleDateFormat.parse("21/03/2018") , new AuthorDTO(alex));
		CommentDTO comment2 = new CommentDTO("Aproveite!",simpleDateFormat.parse("22/03/2018") , new AuthorDTO(bob));
		CommentDTO comment3 = new CommentDTO("Tenha um òtimo dia!",simpleDateFormat.parse("23/03/2018") , new AuthorDTO(luna));
					
		post1.getComments().addAll(Arrays.asList(comment1, comment2));
		post2.getComments().addAll(Arrays.asList(comment3));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		jessica.getPost().addAll(Arrays.asList(post1, post2));
		
		userRepository.save(jessica);
	}
	

}
