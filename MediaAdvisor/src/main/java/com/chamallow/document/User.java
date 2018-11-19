package com.chamallow.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//@Data
@Document
public class User {

	@Id
	private Long id_user ;
	private String email ;
	private String user_name ;
	/*
	 * TODO add birthdate, country, city, postal_code, trust_score
	 */
	public User(Long id_user, String email, String user_name) {
		this.id_user = id_user;
		this.email = email;
		this.user_name = user_name;
	}
	public Long getId_user() {
		return id_user;
	}
	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	
}
