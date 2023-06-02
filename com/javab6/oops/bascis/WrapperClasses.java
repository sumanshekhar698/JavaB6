package com.javab6.oops.bascis;

//Is Java a 100% object oriented language?
public class WrapperClasses {

	public static void main(String[] args) {

		// Primitive Varibles
		int x = 54;
		char y = '3';
		float f = 2.8f;

		// Wrapper classes

		Integer x_ = x;// Auto-boxing

		int z = x_;// Auto-Unboxing
		System.out.println(x_);

	}
}
