package com.javab6.oops.arrrays;

import java.util.Arrays;

public class ReverseAnAray {

	public static void main(String[] args) {

		String arr4[] = { "apple", "mango", "coconut", "peach", "watermelon" };

		String[] reversed = new String[arr4.length];

		int z = reversed.length - 1;
		for (int i = 0; i < reversed.length; i++) {
			reversed[z--] = arr4[i];
		}
		
		System.out.println(Arrays.toString(reversed));

	}

}
