package com.chamallow.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chamallow.document.User;
import com.chamallow.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

	private UserRepository userRepository ; 
	
	public UserResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/all")
	public List<User> getALl() {
		return userRepository.findAll();		
	}
}
