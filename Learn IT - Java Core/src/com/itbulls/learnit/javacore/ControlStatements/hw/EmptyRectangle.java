package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Scanner;
/*
 * Implement console program which will meet the following requirements:
	Program starts and asks user to input height of the rectangle
	After user inputs heights of the rectangle, program asks to input width of the rectangle.
	Program calls specific method which takes two parameters of int type which prints rectangle to the console:
			 ******
	         *    *
	         ******
	In the example above height of the rectangle is 3, the width of the rectangle is 6
	N.B.: rectangle is empty inside
 */
public class EmptyRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		// Iterate over each row
		for (int row = 0; row < height; row++) {
			// Check if it's the first or last row
			if (row == 0 || row == height - 1) {
				// Print a line of width number of asterisks for the top and bottom edges
				for (int column = 0; column < width; column++) {
					System.out.print("*");
					
					/////////////////////////////////////////
					//									   //
					//  USE PRINT() DO NOT USE PRINTLN()   //
					//									   //
					//  PRINTLN() WILL JUST PRINT EACH "*" //
					//									   //
					//  TO A NEW LINE EVERYTIME			   //    
					/////////////////////////////////////////
					
				}
			} else {
				// Print the left and right edges if the rectangle for rows in between
				System.out.print("*"); // Left Edge
				
				// Print empty spaces for the inner part of the rectangle
				for (int column = 0; column <= width - 3; column++) {
					System.out.print(" ");
				}
				System.out.print("*"); // Right Edge
			}

			// Move to the next line after printing each row
			System.out.println();
		}
		
	}

}