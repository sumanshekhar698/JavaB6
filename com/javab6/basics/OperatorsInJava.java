package com.javab6.basics;

public class OperatorsInJava {

	public static void main(String[] args) {

		int x = 10;// asingment

//		unary operators

		x++;// post increment ==> x = x+1;
		System.out.println(x);// 11
		System.out.println(x++);// ? 11 post increment ==> 1st operation the increment | after printing 12
		System.out.println(++x);// ? 13 pre increment ==> 1st increment and then opeeratoion

		x = 100;
		x--;
		--x;
		System.out.println(98);

		x = 1000;

		// x = 998
		// = 999 + 1000 - 1000 + 998 - 998 + 997
		x = --x + ++x - x-- + --x - x-- + x++;
		System.out.println(x);// 1996

//		Shorthand Operators
		int y = 50;
//		y = y + 5;
//		y = 50 + 5;

//		y = y + 5;
		y += 5;// y = y +5

		y = 100;
		y *= 2;// y = y * 2
		System.out.println(y);

		// Arithmatei Opeartors +-/*
		y = 100 % 8;// 100 / 8 modulo operator
		System.out.println(y);

		short s = 32767;
		++s;//
		++s;//
		// Range of Short ==> [-32768 0 32767]
		System.out.println(s);// -32768

		// 9006567388
		long phoneNo = 9006567388l;
		System.out.println(Integer.MAX_VALUE);

		// Bank
		int money = Integer.MAX_VALUE;
		System.out.println(money + '₹');
		money += 100;
		System.out.println(money);

//		Comparison Operators
		int num = 546;
		// < <= > >= == !=
		if (num % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

//		Bitwise Operator
		System.out.println(~9);
		// 1. 9 to binary
		// 2. flip all the bits
		// 3. Convert it to decimal

		System.out.println(9 ^ 9);// 0
		System.out.println(7 & 8);
		System.out.println(9 | 7);//

		System.out.println(8 << 3);// 8 * 2 * 2 *2
		System.out.println(8 >> 3);// 8 / (2 * 2 *2)

	}

}
