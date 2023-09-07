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
	
}
