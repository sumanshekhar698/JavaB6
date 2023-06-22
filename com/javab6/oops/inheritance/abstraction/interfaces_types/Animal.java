package com.javab6.oops.inheritance.abstraction.interfaces_types;

//If ainterface has only one abstract methods ---> Functional Interface

@FunctionalInterface
public interface Animal {

	boolean isOmnivore();//ONLY 1

	// JDK 8
	default void sleeps() {
		System.out.println("SLEPING");
	}

	static void isOmnivorus() {
		System.out.println("False");

	}

}
