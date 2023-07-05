package com.itbulls.learnit.javacore.ControlStatements.hw;

public class AdminGuestMode {
/*
 * Implement console program which will meet the following requirements:
Program can be started in ‘admin’ and ‘guest’ mode
To start program in ‘admin’ mode any of multiple string arguments should be equal to ‘--admin’
To start program in ‘guest’ mode any of multiple string arguments should be equal to ‘--guest’
Program cannot be started with ‘--admin’ and ‘--guest’ arguments simultaneously
If program is started in ‘admin’ mode then "Hello, Admin!" is printed to console
If program is started in ‘guest’ mode then "Hello, Guest!" is printed to console
If program is started with ‘--admin’ and ‘--guest’ arguments then program prints
 "Please, select either 'ADMIN' or 'GUEST' mode for this program" to console
 */

		public static void main(String[] args) {
		    String inputArguments = String.join(",", args);
			String admin = "--admin";
			String guest = "--guest";
			
			if(inputArguments.contains(admin) && inputArguments.contains(guest)) {
			    System.out.println("Please, select either 'ADMIN' or " + "'GUEST' mode for this program");
			} else if (inputArguments.contains(admin)) {
			    System.out.println("Hello, Admin!");
			} else if (inputArguments.contains(guest)){
			    System.out.println("Hello, Guest!");
			}
		
		
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		String admin = "--admin";
//		String guest = "--guest";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please, select Admin or Guest Mode: ");
//		String userInput = sc.nextLine();
//		System.out.println(userInput);
//		
//		if (userInput.equals(admin)) {
//			System.out.println("Hello, Admin!");
//		}
//		else if (userInput.equals(guest)){
//			System.out.println("Hello, Guest!");
//		}
//		else {
//			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
//		}
//	
//	}
//
//}
