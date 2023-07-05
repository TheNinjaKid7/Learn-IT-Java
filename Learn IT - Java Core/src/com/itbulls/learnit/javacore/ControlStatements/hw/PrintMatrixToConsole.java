package com.itbulls.learnit.javacore.ControlStatements.hw;
/*
 * Implement console program which will meet the following requirements:
	Program starts and prints matrix to console. 
	
	Matrix to print:
	{1, 2, 3, 4, 5},
	      {6, 7},
	      {8, 9, 10}
	
	Output should look like this:
	             1        2        3        4        5
	             6        7
	             8        9        10
 */
public class PrintMatrixToConsole {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t" );
            }
            System.out.println();
        }
		
		
	}
	
}
