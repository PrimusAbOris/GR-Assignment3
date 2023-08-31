package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GR_Assignment3 {
	public static User[] userArray = new User[4];
	
	private static UserService userService = new UserService();
	
	public static void main (String[] args) throws IOException {
		textToArray("data.txt");
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			
			boolean validLogin = false;
			int loginAttempts = 0;
			while (!validLogin && loginAttempts < 5) {
				System.out.println("Enter your email:");
				String username = scanner.nextLine();
				System.out.println("Enter your password: ");
				String password = scanner.nextLine();
				
				if (userService.checkLogin(username, password) == true) {
					System.out.println("Welcome: " + validUser.getName()); // name, not username
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

	public static void textToArray(String filename) throws FileNotFoundException, IOException {
		
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

	}
}
