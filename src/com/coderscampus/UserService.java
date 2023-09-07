package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
	public boolean checkLogin(String username, String password, User[] uArray) {
		for (User user : uArray) {
			if (user.getUsername() == username && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}
	
	public User createUserFromArray (String[] stringArray) {		
		User currentUser = new User(stringArray[0], stringArray[1], stringArray[2]);
		
		// testing to see if creation was successful
		System.out.println(currentUser.getUsername());
		System.out.println(currentUser.getPassword());
		System.out.println(currentUser.getName());
		
		return currentUser;
	}
	
	public static String[] parseText(String input) {
		String[] inputArray = input.split(",");
		return inputArray;
	}
	
	public static User createUser (String username, String password, String name) {
		User user = new User(username, password, name);
		return user;
	}
	
	public static User[] textToArray(String filename) throws FileNotFoundException, IOException {
		User[] userArray = new User[4];
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line = null;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				userArray[i] = new User(line.split(","));
				System.out.println(userArray[i].getUsername());
				System.out.println(userArray[i].getPassword());
				System.out.println(userArray[i].getName());
				i++;
			}
		} finally {
		}
		
		reader.close();
		return userArray;
	}
}
