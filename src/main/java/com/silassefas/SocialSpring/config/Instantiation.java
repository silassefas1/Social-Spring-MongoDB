package com.silassefas.SocialSpring.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.silassefas.SocialSpring.domain.Post;
import com.silassefas.SocialSpring.domain.User;
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
		
		Post post1 = new Post(null, simpleDateFormat.parse("21/03/2018"),"Partiu viagem", "Vou Viajar para São Paulo. Abrços!", jessica );
		Post post2 = new Post(null, simpleDateFormat.parse("21/03/2018"),"Bom Dia", "Acordei Feliz Hoje!", jessica );
		
		userRepository.saveAll(Arrays.asList(jessica, luna, maria, alex, bob));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}
	

}
