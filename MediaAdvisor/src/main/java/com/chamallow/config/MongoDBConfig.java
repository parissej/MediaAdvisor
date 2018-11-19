package com.chamallow.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chamallow.document.User;
import com.chamallow.repository.UserRepository;

//@EnableMongoRepositories(basePackageClasses = UserReppository.class)
@Configuration
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner cmdLineRunner(UserRepository userRepository) {
		return strings -> {
			userRepository.save(new User(1L, "pierre@gmail.com", "pierre")) ;
			userRepository.save(new User(2L, "leonore@gmail.com", "leonore")) ;
			userRepository.save(new User(3L, "jean@gmail.com", "jean")) ;
			userRepository.save(new User(4L, "juliette@gmail.com", "juliette")) ;
			userRepository.save(new User(5L, "guillaume@gmail.com", "guillaume")) ;
		} ;
	}
}