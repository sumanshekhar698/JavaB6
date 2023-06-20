package com.javab6.oops.inheritance.overriding;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	new B().display();
	new B().todayDate();
	}

}

class B extends A {
	
	@Override//Runtime Polymorphism
	void display(){
		System.out.println("BBBBBBBBBBBBB");
//		super.display();
	}
	
	//Date , REGEX
	void todayDate() {//specialized methods
		 LocalDate date = LocalDate.now();    
		    LocalDate yesterday = date.minusDays(1);    
		    LocalDate tomorrow = yesterday.plusDays(2);    
		    System.out.println("Today date: "+date);    
		    System.out.println("Yesterday date: "+yesterday);    
		    System.out.println("Tomorrow date: "+tomorrow);    
		System.out.println();
		
	}
}

class A {
	void display() {
		System.out.println("AAAAAAAAAAAAAA");
	}
}