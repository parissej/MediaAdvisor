package com.chamallow.config;

import java.time.LocalDate;

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
			userRepository
					.save(new User(1L, "pierre@gmail.com", "pierre", LocalDate.now(), "France", "Lille", "59000", 1));
			userRepository
					.save(new User(2L, "leonore@gmail.com", "leonore", LocalDate.now(), "France", "Lille", "59000", 1));
			userRepository.save(new User(3L, "jean@gmail.com", "jean", LocalDate.now(), "France", "Lille", "59000", 1));
			userRepository.save(
					new User(4L, "juliette@gmail.com", "juliette", LocalDate.now(), "France", "Lille", "59000", 1));
			userRepository.save(
					new User(5L, "guillaume@gmail.com", "guillaume", LocalDate.now(), "France", "Lille", "59000", 1));
		};
	}
}