package com.javab6.oops.encapulation;

public class Main {

	public static void main(String[] args) {
		
		
		int area;
//		Shape shape = new Shape();//Shape() constructor
//		 area = shape.calculateArea();
//		System.out.println(area);
//		
		
		Shape shape2 = new Shape(9,9);//Shape() constructor
		area = shape2.calculateArea();
		System.out.println(area);


		shape2.length =100;
		area = shape2.calculateArea();
		System.out.println(area);
		System.out.println(shape2);
		
		Shape shape2_ = shape2.returnSameObjectBack();
		System.out.println(shape2_);

		
	}
}
