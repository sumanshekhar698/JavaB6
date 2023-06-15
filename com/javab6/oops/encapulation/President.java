package com.javab6.oops.encapulation;

public class President {

	String name;
	int age;

	private  President(String name, int age) {//use of Private Constructors ?
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + "]";
	}

}
