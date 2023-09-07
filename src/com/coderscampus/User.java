package com.coderscampus;

public class User {
	/* User POJO */
	// Variables
	private String username;
	private String password;
	private String name;
	
	public User() {
		// Blank constructor
		// Only constructor: object variables are set in other methods
	}
	
	// Getters and setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
