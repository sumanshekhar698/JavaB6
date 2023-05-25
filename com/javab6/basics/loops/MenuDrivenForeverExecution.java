package com.javab6.basics.loops;

import java.util.Scanner;

public class MenuDrivenForeverExecution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		menu: while (true) {
			System.out.println("Enter a option for your drink. \n 1.Coke \n 2.Sprite \n 3.Boat \n 4.Limca \n 0.EXIT");

			int option = scanner.nextInt();

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
			case 0: {
				System.out.println("Thanks for visiting us, Have a good day.");
				break menu;
//				break;
//				System.exit(6);//VERY BAD PRACTICE
			}
			default: {
				System.out.println("Invalid option");
			}
			}

		}
	}

}
