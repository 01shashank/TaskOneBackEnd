package com.hexaware.task1backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_Id;
	
	private String username;
	
	private String full_name;
	
	private String password;
	
	private String location;
	
	private String education;
	
	private String occupation;
	
	private String hobbies;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String full_name, String password, String location, String education,
			String occupation, String hobbies) {
		super();
		this.username = username;
		this.full_name = full_name;
		this.password = password;
		this.location = location;
		this.education = education;
		this.occupation = occupation;
		this.hobbies = hobbies;
	}
	
	

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	

}
