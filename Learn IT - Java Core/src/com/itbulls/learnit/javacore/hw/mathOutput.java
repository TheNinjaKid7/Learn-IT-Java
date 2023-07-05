package com.itbulls.learnit.javacore.hw;

import java.util.Formatter;

public class mathOutput {

	public static void main(String[] args) {

		/*
		 * Program starts and prints Math.PI five times in console output
			The first Math.PI contains only one fraction digit
			The second Math.PI contains two fraction digits
			The third time Math.PI contains three fraction digits
			The fourth time Math.PI contains four fraction digits
			The fifth time Math.PI contains five fraction digits

		 */

			Formatter formatter = new Formatter();
			
			formatter.format("%.1f%n", Math.PI);
			formatter.format("%.2f%n", Math.PI);
			formatter.format("%.3f%n", Math.PI);
			formatter.format("%.4f%n", Math.PI);
			formatter.format("%.5f%n", Math.PI);
			
			System.out.println(formatter);
		}
	}
