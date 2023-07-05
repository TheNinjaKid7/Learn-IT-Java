package com.itbulls.learnit.javacore.ControlStatements.hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of the initial array: ");
        int baseArrayLength = sc.nextInt();
        int[] arr = generateRandomArray(baseArrayLength);
        int[] extendedArray = extendArray(arr);
        System.out.println("*** Initial array ***");
        System.out.println(Arrays.toString(arr));
        System.out.println("*** Extended array ***");
        System.out.println(Arrays.toString(extendedArray));
    }

    // Method to extend the array by appending elements multiplied by two
    public static int[] extendArray(int[] arr) {
        int extendedLength = arr.length * 2; // Calculate the length of the extended array
        int[] extendedArray = new int[extendedLength]; // Create a new array with the calculated length

        for (int i = 0; i < arr.length; i++) {
            extendedArray[i] = arr[i]; // Copy elements from the original array to the extended array
            extendedArray[arr.length + i] = arr[i] * 2; // Set corresponding element in the extended array to the element multiplied by two
        }

        return extendedArray; // Return the extended array
    }

    // Method to generate a random array with the specified length
    public static int[] generateRandomArray(int amountOfElements) {
        int[] randomArray = new int[amountOfElements]; // Create a new array with the specified length
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100) + 1; // Generates a random number in the range from 1 to 100
        }

        return randomArray; // Return the randomly generated array
    }
}
