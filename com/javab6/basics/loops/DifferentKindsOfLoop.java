package com.javab6.basics.loops;

import java.util.Iterator;

public class DifferentKindsOfLoop {
	int i = 2;
	public static void main(String[] args) {

		int i = 2;
		// 1 -10
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

//		FOR loop
		// SCOPE OF VARIABLES
		// 1 - 1000 EVEN
//		for (int i = 2; i <= 1000; i += 2) {// i = 1002
		for (; i <= 1000; i += 2) {// initialisation;condition;updation
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println(i);// 1002

//		while loop
		i = 1;
		while (i <= 1000) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();
//		do while
		do {//iw ill run atleas for one time
			System.out.println("DO WHILE executed");
		} while (5 > 6);

	}

}
