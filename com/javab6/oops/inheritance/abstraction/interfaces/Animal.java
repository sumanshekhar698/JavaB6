package com.javab6.oops.inheritance.abstraction.interfaces;

public interface Animal {
	
	void eatsGrass();
	
	//JDK 8
	 default void sleeps() {
		System.out.println("SLEPING");
	}
	
	static void  isOmnivorus() {
		System.out.println("False");

	}

}
