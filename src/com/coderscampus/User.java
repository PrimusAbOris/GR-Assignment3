package com.coderscampus;

import java.io.FileNotFoundException;
import java.io.IOException;

public class User {
	/* User POJO */
	// Variables
	private String username;
	private String password;
	private String name;
	
	User (String[] uinfo) {
		// Constructor (if given a string array)
		this.username = uinfo[0];
		this.password = uinfo[1];
		this.name = uinfo[2];
	}
	
	User (String username, String password, String name) {
		// Constructor (if given three strings)
		this.username = username;
		this.password = password;
		this.name = name;
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
	
	public static User[] textToArray(String filename) throws FileNotFoundException, IOException {
		int size = 5; // array size; this can be adjusted for other programs if set separately
		User[] users = new User[size];
		for (int i = 0; i < size; i++) {
			User newUser = new User("user" + (i+1), "password" + (i+1), "name" + (i+1));
			// constructs a new User with three separate strings,
			// then stores it in an array of User objects
			users[i] = newUser;
		}
		return users;
	}
	
}
