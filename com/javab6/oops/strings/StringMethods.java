package com.javab6.oops.strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String x = "  \\ \"boxoffice   ";

//		System.out.println(x.toUpperCase());
//		System.out.println(x.toLowerCase());
//		System.out.println(x.hashCode());

		x = x.toUpperCase();
		System.out.println(x);
		System.out.println(x.substring(1, 4));
		System.out.println(x.substring(4));
		System.out.println(x.trim());
		System.out.println(x.indexOf('O'));
		System.out.println(x.indexOf('o'));

		x = "Mang oes are sweet";
		String[] split = x.split(" ");
		System.out.println(Arrays.toString(split));

		String m = "Bunty";
//		m= m.concat(" Buubbly");
		m = m + " Buubly";// conacatinatinhg 2 strings
		System.out.println(m);

		System.out.println(6 + 8);// + is called overloaded operator
		System.out.println(8 + 9 + "5" + 9 + 2 + "A");// 17592A
		System.out.println(8 + 9 + "5" + (9 + 2) + "A");// 17511A
		System.out.println(8 + 2 + "6" + 5 * 7);//108635

		// String m = x.substring(1,4);
//		System.out.println(m);)

	}

}
