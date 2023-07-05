package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Scanner;
/*
 * Program starts and asks user to enter text.
	Program calls specific function which take one parameter of String type and 
	returns amount of words in the text. 
	
	Method should look like this:
	public static int getWordsAmount(String text) {
	<write your code here>
	}
	
	Program prints amount of words to the console.
 */

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		
		String wordsInput =  sc.nextLine();
		
        // Call the getWordsAmount method and store the result 
		// in the wordCount variable
		int amountOfWords = getWordsAmount(wordsInput);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}
	
	// Method to count the number of words in the given text
	
	public static int getWordsAmount(String text) {
		
        // Split the text into words based on whitespace and store them in the words array
		String words [] = text.split("\\s+");
		
        // Return the length of the words array, which represents the number of words
		return words.length;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
