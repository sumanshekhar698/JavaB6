package com.javab6.basics;

//Reserved Keywords
public class BasicDataTypes {// Pascal Case for class names

	public static void main(String[] args) {

//		Basic Primitve Data Types
		
//		Variable Name Rules
//		Length Restriction => No
//		Cannot start with a number but it can have number in between and in the end
//		You can have _ $ in variable name
//		Var name cannot be keywords

//		Variable Name Conventions
//		The var name should be sensible
//		camelCase convention


//		integers
		byte a;// just declaring but not initializing
		short b = 32;// = means assingment operator
		
		Short b_ = b;
		int dozenValue = 12;
		
		Integer dozen = 12;
		long d = 676689L;

		a = 7;
		System.out.println(a);

//		boolean values
		boolean isAGoodWeather = false;
		isAGoodWeather = true;

//		decimals
		float valueOfPi = 3.14F;
		double valueOfPie = 3.14159;

//		A
//		characters
		char characterOfSpace = ' ';
		char characteOfA = 'A';
		
		Character x_ = 'X';

		int utfValueOfA = (int) characteOfA;
		System.out.println(utfValueOfA);
		char rupeeSymbol = '₹';
		System.out.println(rupeeSymbol);
		System.out.println((int) rupeeSymbol);

	}

	// applesaresweet = small/lower case
	// APPLESARESWEET = UPPERCASE
	// applesAreSweet = camelCase*
	// ApplesAreSweet = PascalCase*
	// APPLES_ARE_SWEET = CAPITAL_SNAKE_CASE
	// apples_are_sweet = snake_case
	// apples-are-sweet = kebab-case

}
