package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Scanner;

public class FirstCharCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();

		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		// Convert the string to lowercase and convert it to a character array
		char[] chars = string.toLowerCase().toCharArray();

		// Track whether we have encountered the first letter of a word
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			// Check if we haven't found the first letter of a word and the current
			// character is a letter
			if (!found && Character.isLetter(chars[i])) {
				
				// Convert the current character to uppercase
				chars[i] = Character.toUpperCase(chars[i]);

				// Set found to true to indicate the first letter has been found
				found = true;

			} else if (Character.isWhitespace(chars[i])) { // Check if the current character is a whitespace character
				found = false; // Set found to false to indicate the start of a new word
			}
		}

		return String.valueOf(chars); // Convert the character array back to a string and return the result
	}

}