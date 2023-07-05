package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();

		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		int count = 0;
		// Iterate over each word in the entered words array and count the number of
		// words
		for (String word : words) {
			if (word.length() >= minLength) {
				count++;
			}
		}
		// Create a new array with the size equal to the number of filtered words
		String filteredWords[] = new String[count];
		int index = 0;

		// Iterate over each word again and add the filtered words to the array
		for (String word : words) {
			if (word.length() >= minLength) {
				filteredWords[index] = word;
				index++;
			}
		}
		// Return the final array of filtered words
		return filteredWords;
	}
}
