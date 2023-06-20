package com.javab6.oops.inheritance.static_way;

public class InstanceOfoperator {

	public static void main(String[] args) {


		Child child = new Child();
		Parent parent = new Parent();
		System.out.println(child instanceof Child);//true
		System.out.println(child instanceof Parent);//true
		System.out.println(parent instanceof Parent);//treue
		System.out.println(parent instanceof Child);//false

				

		

	}

}

class Parent{
	
}

class Child extends Parent{
	
}
