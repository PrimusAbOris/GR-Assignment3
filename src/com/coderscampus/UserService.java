package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
	public static void main(String[] args) throws IOException {
		//The file information should be stored in your Java application as an Array of User objects.
// Once this data is appropriately stored in your Java application, you can begin the process of prompting for username and password.

		BufferedReader fileReader = null;
		fileReader = new BufferedReader(new FileReader("data.txt"));
		String line;
		
		User[] userArray = new User[4];
		for (int i = 0; i < 1000; i++) {
			// there are 4 lines/users total, but the loop ends when the next line is null...
			try {
					String[] line2;
					userArray[i] = createUser(parseText(line2)[0],parseText(line2)[1],
							parseText(line2)[2]);
			} finally {
				System.out.println("Closing file reader.");
				fileReader.close();
			}
		}
	}
	
	public boolean checkLogin(String username, String password) {
		for (User user : GR_Assignment3.userArray) {
			if (user.getUsername() == username && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}
	
	public User createUserFromArray (String[] stringArray) {
		User user = new User(stringArray[0], stringArray[1], stringArray[2]);
		return user;
	}
	
	public static String[] parseText(String input) {
		String[] inputArray = input.split(",");
		return inputArray;
	}
	
	public static User createUser (String username, String password, String name) {
		User user = new User(username, password, name);
		return user;
	}
}
