package com.javab6.oops.inheritance.static_way;

public class Main {

	public static void main(String[] args) {

//		Type Casting
		B b = new B();
		b.call();
		b.sample();

		A a = b;// 1. Upcasting and it happens implicitly
		// Promying a child to Prent level
		a.call();
//		a.sample();

		A a1 = new B();

//		2. DOWNCASTING
//		B b = new A();//
//		B b1 = (B) new A();// FORCED DOWNCASTING : java.lang.ClassCastException
		
		B b2_ = (B)a;//** You can downcast an already upcasted object - EXPLICITLY
		b.sample();

	}

}

class A {

	static void call() {
		System.out.println("CAlling ...");
	}
}

class B extends A {

//	 void call() {//ovwriding a static method via not static method is NOT possible
//		System.out.println("Calling vias phone ...");
//	}

//	METHOD HIDING
	static void call() {
		System.out.println("Calling vias phone ...");
	}

	void sample() {// SPECIALIZED
		System.out.println("Samplinggggggggg");
	}
}