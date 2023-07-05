package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Implement console program which will meet the following requirements:
	Program starts and asks user to input integer numbers separated by space.
	Program creates array object with entered numbers.
	Program calls specific method which takes int[] as an parameter and returns max value in this array.
	
	Method should look like this:
	public static int findMaxIntInArray(int[] intArray) {
	<write your code here>
	}
	
	Program prints max value from the array to the console.
 */
public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String input = sc.nextLine();
		
		String[] numbersString = input.split(" ");
		int[] intArray = new int[numbersString.length];
		
		for (int i = 0; i < numbersString.length; i++) {
			intArray[i] = Integer.parseInt(numbersString[i]);
		}
		
		int maxInt = findMaxIntInArray(intArray);
		
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}


	
	public static int findMaxIntInArray(int[] intArray) {
	    int max = Integer.MIN_VALUE; // Set initial max value to the smallest possible integer
	    
	    for (int num : intArray) {
	        if (num > max) {
	            max = num; // Update max if a larger value is found
	        }
	    }
	    
	    return max;
	}
}
