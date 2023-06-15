package com.javab6.oops.encapulation.polumorphism;

public class Shapes {

	int areaOfASquare(int side) {
		return side * side;
	}

	int areaOfARactange(int length, int breadth) {
		return length * breadth;
	}

	double areaOfACircle(float radius) {
//		return 3.14159f * radius *radius;
		return Math.PI * radius * radius;
	}

	float areaOfATriangle(float base, float height) {
//		return 3.14159f * radius *radius;
		return 0.5f * base * height;
	}

}
