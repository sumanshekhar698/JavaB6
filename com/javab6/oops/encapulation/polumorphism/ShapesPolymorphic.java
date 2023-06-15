package com.javab6.oops.encapulation.polumorphism;

public class ShapesPolymorphic {

	
	//Uniqueness pf Parameters is defined by 
	//1. No of Parameters
	//2. Type of Parameter
	//3. Position of parameters
	
	
	//POLYMORPHISM  - (COMPILE TIME POLYMORPHISM) --> (METHOD OVERLOADING)
	//area method/fn is overloaded 
	
	int area(int side) {//1
		return side * side;
	}

	
	
	float area(float length, int breadth) {//2
		return length * breadth;
	}

	double area(float radius) {
//		return 3.14159f * radius *radius;
		return Math.PI * radius * radius;
	}

	float area(int base, float height) {//2
//		return 3.14159f * radius *radius;
		return 0.5f * base * height;
	}

}
