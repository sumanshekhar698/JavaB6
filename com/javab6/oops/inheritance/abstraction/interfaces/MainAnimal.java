package com.javab6.oops.inheritance.abstraction.interfaces;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal cow = new Animal() {
			
			@Override
			public void eatsGrass() {
				System.out.println("Eating lush green grass");
			}
		};
		
		cow.eatsGrass();
		cow.sleeps();
		Animal.isOmnivorus();

	}
}
