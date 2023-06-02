package com.javab6.oops.arrrays;

import java.util.Arrays;

public class PassByValueAndRefernce {

	public static void main(String[] args) {


		int [] arr= {14,45,4,55,55};
		change(arr);
		System.out.println(Arrays.toString(arr));
		

	}
//	array, arr -------> same {14,45,4,55,55};
	static void change(int [] array){//pass by ref
		Arrays.fill(array, -9);
	}

}
