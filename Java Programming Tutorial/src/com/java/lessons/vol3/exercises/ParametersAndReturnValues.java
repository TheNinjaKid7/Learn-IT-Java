package com.java.lessons.vol3.exercises;

import java.util.Scanner;

public class ParametersAndReturnValues {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // New Scanner object for keyboard input
		
		double grade1 = 1.0, grade2 = 1.0, grade3 = 1.0; // these will hold grade inputs
		double average = 1.0; // this will hold answer
		
		System.out.println("Enter grade 1: ");
		grade1 = input.nextDouble(); //ask for grade 1 
		
		System.out.println("Enter grade 2: ");
		grade2 = input.nextDouble(); //ask for grade 2 
		
		System.out.println("Enter grade 3: ");
		grade3 = input.nextDouble(); //ask for grade 3
		
		// Call method avgGrades, pass grades as parameters, method returns average of grades
		average = avgGrades(grade1, grade2, grade3);
		
		System.out.println("\nThe average of these grades is: " + average);
	}
	// Method takes as parameters the grades and assigns them to doubles: a, b, c
	public static double avgGrades(double a, double b, double c) {
		double avg = (a+b+c)/3.0; // calculate the average
		return avg; // return the result
		
	}
}
