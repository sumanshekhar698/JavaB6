package com.javab6.oops.encapulation.polumorphism;

public class Main {

	public static void main(String[] args) {

		Shapes shapes = new Shapes();
		System.out.println(shapes.areaOfACircle(60));
		
		ShapesPolymorphic shapesPolymorphic = new ShapesPolymorphic();
		System.out.println("AREA OF SQR => "+shapesPolymorphic.area(5));
		System.out.println("AREA OF CIRCLE => "+shapesPolymorphic.area(5.0f));
		
		System.out.println();
		areaTEST();
		

	}
	
	
	static void areaTEST(){
		System.out.println("AREAAAAAAAAAAAAA");
	}

}
