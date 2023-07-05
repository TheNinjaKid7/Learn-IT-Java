package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Scanner;

/*
 * Implement console program which will meet the following requirements:
	Program starts and asks user to enter the height of the pyramid.
	Program draws such picture in console:
	
	*
	**
	***
	****
	***
	**
	*
	In example above the height of the pyramid is 4
 */
public class PyramidInConsole {

	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
		Scanner sc = new Scanner(System.in);
		int heightOfPyramid = sc.nextInt();
		//System.out.println("Height of Pyramid is: " + heightOfPyramid);

		for (int i = 1; i <= heightOfPyramid; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = heightOfPyramid - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
