package com.coderscampus;

import java.util.Scanner;

public class UserApplication {
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User[] users = new User[13];
		
		for (int i = 0; i < 13; i++) {
			users[i] = UserService.createUser("user" + (i+1), "password" + (i+1), "name" + (i+1));
		}

		System.out.println(users);		

		String [] exampleArray = UserService.parseText("exampleUsername,examplePassword,exampleName");
		for (String example : exampleArray) {
			System.out.println(example);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 5; i >= 1; i--) {
		
			String username = collectInput(scanner, "What is your username?");
			String password = collectInput(scanner, "What is your password?");
		}

		
		
	}
	
	private static String collectInput(Scanner scanner, String messageToDisplay) {
		System.out.println(messageToDisplay);
		String userInput = scanner.nextLine();
		return userInput;
	}
	
	public static boolean checkLogin(username, password) {
		users[] = textToArray("data.txt");
		for (int i = 5; i >= 1; i--) {
			if (users[i].username == username) {
				return true;
			}
		}
		return false;
	}
}
