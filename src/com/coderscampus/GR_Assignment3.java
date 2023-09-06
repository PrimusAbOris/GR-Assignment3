package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GR_Assignment3 {

		
	public static void main (String[] args) throws IOException {
		textToArray("data.txt");
		
		Scanner scanner = null;
		try {
			private UserService userService = new UserService();
			scanner = new Scanner(System.in);
			
			boolean validLogin = false;
			int loginAttempts = 0;
			while (!validLogin && loginAttempts < 5) {
				System.out.println("Enter your email:");
				String username = scanner.nextLine();
				System.out.println("Enter your password: ");
				String password = scanner.nextLine();
				
				if (userService.checkLogin(username, password) == true) {
					System.out.println("Welcome: " + User.getName()); // name, not username
					break;
				} else {
					System.out.println("Invalid login, please try again");
					loginAttempts++;
					if (loginAttempts >= 5) {
						System.out.println("Too many failed login attempts, you are now locked out.");
					}
				}
			}
		} finally {
		}
		
		scanner.close();
		
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
				System.out.println(userArray[i]);
				i++;
			}
		} finally {
		}
		
		reader.close();
		return userArray;
	}
}
