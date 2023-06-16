package com.javab6.oops.encapulation.static_concepts;

public class President {// Singelton

	private String name;
	private int age;
	static President pres = null;

	// 1. Make the constructor private
	private President(String name, int age) {// use of Private Constructors ?
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + "]";
	}

	static President createPresident(String name, int age) {

		if (pres == null) {
			pres = new President(name, age);
			return pres;
		} else {
			return pres;
		}

	}
}
