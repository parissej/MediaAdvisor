package com.chamallow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chamallow.document.User;
import com.chamallow.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/all")
	public List<User> getALl() {
		return this.userRepository.findAll();
	}
}
