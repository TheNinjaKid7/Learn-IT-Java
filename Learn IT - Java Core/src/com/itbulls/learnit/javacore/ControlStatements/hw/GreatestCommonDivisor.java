package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Scanner;

public class GreatestCommonDivisor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter two numbers separated by space: ");
        String userInput = sc.nextLine();
        
        String[] inputArgumentsArray = userInput.split("\\s+");
        int number1 = Integer.parseInt(inputArgumentsArray[0]);
        int number2 = Integer.parseInt(inputArgumentsArray[1]);
        
        System.out.println(gcdRecursive(number1, number2));
    }
    
    public static int gcdRecursive(int firstNumber, int secondNumber) {
        // Take absolute values of the input numbers to ensure positive values for GCD calculation
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);

        // Base case: If the second number is zero, the GCD is the first number
        if (secondNumber == 0) {
            return firstNumber;
        }

        // Recursive call: Calculate GCD using Euclidean algorithm
        return gcdRecursive(secondNumber, firstNumber % secondNumber);
    }
    	//Test if fetch works
}

