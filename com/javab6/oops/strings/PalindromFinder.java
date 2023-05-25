package com.javab6.oops.strings;

import java.util.Scanner;

public class PalindromFinder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check the palindroe");
		String input = sc.nextLine();

//		madam  z  malayalam radar

		String reversed ="";
		int i = input.length() - 1;
		while (i >= 0) {
			reversed+=input.charAt(i--);
		}
		
//		System.out.println(reversed);
		
		if(reversed.equals(input))
			System.out.println(true);
		else 
			System.out.println(false);

	}

}
