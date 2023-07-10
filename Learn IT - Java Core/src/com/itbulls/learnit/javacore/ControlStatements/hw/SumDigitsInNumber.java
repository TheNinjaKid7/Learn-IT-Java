package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		int sum = 0;
		int temp = number;

        // Take absolute values of the input numbers to ensure positive values for sumDigitsInNumber calculation
		sum = Math.abs(sum);
		temp = Math.abs(temp);		
		
		while (temp != 0) {
			int digit =  temp % 10; // Extract the rightmost digit
			sum = sum + digit; // Add the digit to the sum
			temp = temp / 10; // Remove the rightmost digit
		}
		return sum;
	}
	
}
