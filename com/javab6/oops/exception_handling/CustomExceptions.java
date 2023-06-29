package com.javab6.oops.exception_handling;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER AGE to check voting eligiblity?");

		int age = scanner.nextInt();
		try {
			boolean result = validate(age);
			System.out.println(result);
		} catch (InvalidVotingAge e) {
			e.printStackTrace();
		}
	}

	private static boolean validate(int age) throws InvalidVotingAge {
		if (age < 18)
			throw new InvalidVotingAge("The person in under age");
		else
			return true;
	}

}

class InvalidVotingAge extends Exception {

	public InvalidVotingAge(String message) {
		super(message);
	}

}
