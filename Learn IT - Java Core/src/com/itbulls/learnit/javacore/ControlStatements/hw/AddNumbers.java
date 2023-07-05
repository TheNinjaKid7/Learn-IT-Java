package com.itbulls.learnit.javacore.ControlStatements.hw;

public class AddNumbers {
/*
 *  Implement console program which will meet the following requirements:
	Program is started with two arguments (numbers)
	Program adds these two numbers
	In case one of the input arguments is floating-point number - the result of addition is floating-point number
	In case two arguments are integer - the result of addition is integer
 */
	public static void main(String[] args) {

		        if (args[0].contains(".") || args[1].contains(".")) {
		            double paramDouble1 = Double.parseDouble(args[0]);
		            double paramDouble2 = Double.parseDouble(args[1]);
		            System.out.println(paramDouble1 + paramDouble2);
		        } else {
		            int paramInt1 = Integer.parseInt(args[0]);
		            int paramInt2 = Integer.parseInt(args[1]);
		            System.out.println(paramInt1 + paramInt2);
		        }
			}
	}
