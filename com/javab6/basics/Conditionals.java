package com.javab6.basics;

public class Conditionals {

	public static void main(String[] args) {

		int x = 788;

		if (x % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		int age = 19;

		if (age >= 18 && age < 20)// if else if ladder
			System.out.println("Teenage");
		else if (true) {
			System.out.println("Adult");
		} else {
			System.out.println("You are aging");
		}
//		&& => Logical AND || logical OR operators

		int m = 45;

		if (m % 2 == 0)
			System.out.println("EVEN");
		System.out.println("XYZZZ");
		if (m % 5 == 0)
			System.out.println("Divisible by 5");

	}
}
