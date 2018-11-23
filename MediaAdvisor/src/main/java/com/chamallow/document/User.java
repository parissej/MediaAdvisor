package com.chamallow.document;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Data
@Document
public class User {

	@Id
	private Long id_user;
	private String email;
	private String user_name;
	private LocalDate birthdate;
	private String country;
	private String city;
	private String postal_code;
	private int trust_score;

	public User(Long id_user, String email, String user_name, LocalDate birthdate, String country, String city,
			String postal_code, int trust_score) {
		this.setId_user(id_user);
		this.setEmail(email);
		this.setUser_name(user_name);
		this.setBirthdate(birthdate);
		this.setCountry(country);
		this.setCity(city);
		this.setPostal_code(postal_code);
		this.setTrust_score(trust_score);
	}

	public Long getId_user() {
		return this.id_user;
	}

	public void setId_user(Long id_user) {
		this.id_user = id_user;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_name() {
		return this.user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(LocalDate pBirthdate) {
		this.birthdate = pBirthdate;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String pCountry) {
		this.country = pCountry;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String pCity) {
		this.city = pCity;
	}

	public String getPostal_code() {
		return this.postal_code;
	}

	public void setPostal_code(String pPostal_code) {
		this.postal_code = pPostal_code;
	}

	public int getTrust_score() {
		return this.trust_score;
	}

	public void setTrust_score(int pTrust_score) {
		this.trust_score = pTrust_score;
	}

}
