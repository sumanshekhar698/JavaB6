package com.javab6.oops.encapulation;

public class Shape {// encapsulation

	// has
	int length;
	int width;

	// does
	int calculateArea() {
		return length * width;
	}
	// Java adds a default constructor

	// constructors dont have a return type and they gets automatocally invoked
	// while creating objects
	Shape() {// paraterless constuctor
		this(7);
		System.out.println("Shape() called");
	}

	Shape(int x) {// paraterless constuctor
//		this();
		System.out.println("Shape(x) called");
	}

	// Constructiors are generally used to initiaze the instance vars
	Shape(int length, int breadth) {// parameterized constructor
		this();// constructor chaining shoun be thw 1st statement
		System.out.println("Shape(parameterized) called");
		this.length = length;// shadow issue
		this.width = breadth;
	}

	Shape returnSameObjectBack() {
		return this;
	}

}
