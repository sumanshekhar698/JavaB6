package com.javab6.basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("Enter a option for your drink. \n 1.Coke \n 2.Sprite \n 3.Boat \n 4.Limca ");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

//		if (option == 1)
//			System.out.println("Enjoy your coke");
//		else if (option == 2)
//			System.out.println("Enjoy your Sprite");
//		else if (option == 3)
//			System.out.println("Enjoy your Boat fruit drink");
//		else if (option == 4)
//			System.out.println("Enjoy your Limca");
//		else
//			System.out.println("Invalid option");

		switch (option) {
		case 1: {
			System.out.println("Enjoy your coke");
			break;
		}
		case 2: {
			System.out.println("Enjoy your Sprite");
			break;
		}
		case 3: {
			System.out.println("Enjoy your Boat fruit drink");
			break;
		}
		case 4: {
			System.out.println("Enjoy your Limca");
			break;
		}
		default: {
			System.out.println("Invalid option");
		}
		}

	}

}
