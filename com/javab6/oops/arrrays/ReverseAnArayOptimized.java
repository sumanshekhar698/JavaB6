package com.javab6.oops.arrrays;

import java.util.Arrays;

public class ReverseAnArayOptimized {

	public static void main(String[] suman) {//var args

		System.out.println(suman.length);
		String arr4[] = { "apple", "mango", "coconut", "peach", "watermelon" , "banana"};// size n

		int i = 0;
		int j = arr4.length - 1;

		while (i <= j) {//n/2

			String temp = arr4[i];
			arr4[i] = arr4[j];
			arr4[j] = temp;

			i++;
			j--;

		}

		System.out.println(Arrays.toString(arr4));

	}

}
