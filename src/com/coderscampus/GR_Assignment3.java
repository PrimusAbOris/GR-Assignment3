package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GR_Assignment3 {

	public static void main(String[] args) throws IOException {
		int size = 4; // amount of users in provided data
		BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
		User[] userArray = new User[size]; // this will be filled using the file in the line above

		String line;
		boolean validLogin = false;
		int loginAttempts = 0;

		try { // Splits the file into User objects

			int i = 0; // line position in file

			while ((line = reader.readLine()) != null) {
				String[] arrayLine = line.split(",");
				String currUsername = arrayLine[0];
				String currPassword = arrayLine[1];
				String currName = arrayLine[2];

				User currUser = new User();
				currUser.setUsername(currUsername);
				currUser.setPassword(currPassword);
				currUser.setName(currName);

				userArray[i] = currUser;
				i++;

			}

		} finally {
		}

		try { // Now, get input from the user (of the program)
			Scanner scanner = new Scanner(System.in);

			for (int i = 1; i <= 5; i++) {
				// The integer i is the current login attempt
				// The integer n is a position in the user array
				System.out.println("Please enter your username: ");
				String username = scanner.nextLine();
				System.out.println("Please enter your password: ");
				String password = scanner.nextLine();

				for (int n = 0; n < 4; n++) {
					if (userArray[n].getUsername().equals(username) && userArray[n].getPassword().equals(password)) {
						System.out.println("Welcome, " + userArray[n].getName());
						validLogin = true;
						System.exit(0);; // Don't ask for another login if successful
					}
				}
				// if it went through the list and didn't find it...
				System.out.println("Invalid login, please try again");
			}

			// Now outside the for loop that uses i
			if (!validLogin) {
				System.out.println("Too many failed login attempts, you are now locked out.");
			} // end of try block in main
		} finally {

		}

		return;

	}

	public boolean findUsername(String username, User[] userArray) {
		// Makes sure a username is in the array

		for (int i = 0; i <= 5; i++) {
			if (username.equals(userArray[i].getUsername())) {
				return true;
			}
		}
		return false;
	}

	private String usernameToPassword(String username, User[] userArray) {
		// Given a username, returns its password in plain text

		for (int i = 0; i <= 5; i++) {
			if (userArray[i].getUsername().equals(username)) {
				return userArray[i].getPassword();
			}
		}
		// If the username isn't on any of the lines
		return "";

	}

	public boolean validLogin(String username, String password, User[] userArray) {
		// Checks if a given username and password is in the array in the same index
		// If it is, return true
		if (findUsername(username, userArray)) {
			if (password.equals(usernameToPassword(username, userArray))) {
				return true;
			}
		}
		return false;
	}

	public User buildUser1(String[] uinfo) {
		// Creates a User object (given a string array)
		User user = new User();
		user.setUsername(uinfo[0]);
		user.setPassword(uinfo[1]);
		user.setName(uinfo[2]);

		return user;
	}

	public User buildUser2(String username, String password, String name) {
		// Creates a User object (if given three strings)
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);

		return user;
	}
}
