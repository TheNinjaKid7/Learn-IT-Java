package com.itbulls.learnit.javacore.ControlStatements.hw;

public class StringProcessor {
	public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator()
			+ "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator()
			+ "james;Derek James;james@gmail.com" + System.lineSeparator() + "jackson;Walter Jackson;jackson@gmail.com"
			+ System.lineSeparator() + "gregory;Mike Gregory;gregory@yahoo.com";

	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));

		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));

	}

	public static String convert1(String input) {
		StringBuilder result = new StringBuilder();

		String lines[] = input.split(System.lineSeparator());
		for (int i = 1; i < lines.length; i++) {
			String parts[] = lines[i].split(";");
			if (parts.length >= 3) {
				// Append login and email to the result
				result.append(parts[0]).append(" ==> ").append(parts[2]).append(System.lineSeparator());
			}
		}
		return result.toString();
	}

	public static String convert2(String input) {
		StringBuilder result = new StringBuilder();

		String lines[] = input.split(System.lineSeparator());
		for (int i = 1; i < lines.length; i++) {
			String parts[] = lines[i].split(";");
			if (parts.length >= 3) {
				String login = parts[0];
				String name = parts[1];
				String email = parts[2];
				// Format the name and append it along with the email to the result
				result.append(name).append(" (email: ").append(email).append(")").append(System.lineSeparator());
			}

		}
		return result.toString();
	}

}
