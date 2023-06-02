package com.javab6.oops.arrrays;

import java.util.Arrays;

import com.javab6.oops.bascis.Animal;

public class OneDArrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z[];

		int[] arr = new int[10];
		int arr2[] = new int[5];
		int arr3[] = { 4, 34, 54, 4, 54, 564, 4 };

		String arr4[] = { "apple", "mango", "coconut" };
		Animal arr5[] = { new Animal(), new Animal() };

		arr3[2] = 999;
		System.out.println(arr);

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

		System.out.println(Arrays.toString(arr3));// ctrl+shift+O

		// Use you own Logic : Bubble Sort (Design a bubble sort)

		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));

		Arrays.fill(arr, 99);
		System.out.println(Arrays.toString(arr));

		Arrays.fill(arr, 3, 7, -1);
		System.out.println(Arrays.toString(arr));

		String[] stringArr = new String[5];
		System.out.println(Arrays.toString(stringArr));// String : null
		stringArr[2] = "Java";

		Toy[] toys = new Toy[5];
		toys[2] = new Toy();
		System.out.println(Arrays.toString(toys));//

	}

}
