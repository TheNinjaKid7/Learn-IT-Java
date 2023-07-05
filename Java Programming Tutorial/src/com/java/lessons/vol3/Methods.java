package com.java.lessons.vol3;

public class Methods {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 102;
		
		int answer1;
		int answer2;
		boolean answer3;
		
		answer1 = multNumbers(num1);
		System.out.println("When we multiply num1 by 7 we get: " + answer1);
		
		answer2 = addNumbers(num1,num2);
		System.out.println("\nWhen we add num1 and num2, we get: " + answer2);
		
		answer3 = equalNumbers(num1, num2);
		System.out.println("\nnum1 and num2 are equal: " + answer3);
		
	}
	
	public static int multNumbers(int a) {
		return (a * 7);
		
//		int ans = a * 7;
//		
//		return ans;
	}
	
	public static int addNumbers(int x, int y) {
		int ans = x + y;
		
		return ans;
	}
	
	public static boolean equalNumbers(int r, int t) {
		if(r == t) return true;
		
		else return false;
	}
	
	

}
