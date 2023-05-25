package com.javab6.oops.strings.mutable;

import java.util.Scanner;

public class PalindromFinder {

	public static void main(String[] args) {

		String input = new Scanner(System.in).nextLine();
		System.out.println(new StringBuilder(input).reverse().toString().equals(input));

		


	}

}
