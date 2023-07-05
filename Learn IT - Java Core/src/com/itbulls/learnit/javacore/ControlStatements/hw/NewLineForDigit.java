package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Scanner;

public class NewLineForDigit {
    /*
     * Implement console program which will meet the following requirements:
		Program starts and asks user to enter integer number
		Program prints each digit from the new line
		
		EXAMPLE:
		User input: “12345”
		
		Program console output:
		1
		2
		3
		4
		5
     */
    public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String intString = sc.next();
		// For each 'individual' character in the intString,
		// print out a digit
		for(char digit: intString.toCharArray()) {
		System.out.println(digit);
		}
		
    }
   
}
