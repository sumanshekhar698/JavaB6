package com.javab6.oops.encapulation.static_concepts;

public class Teacher {

	static int counter = 14;
	String name;
	String empID;

	public Teacher(String name, String empID) {
		super();
		this.name = name;
		this.empID = empID;
	}

	
	public Teacher(String name) {
		super();
		this.name = name;
		this.empID = "TEACH" + counter++;
	}


	@Override
	public String toString() {
		return "Teacher [name=" + name + ", empID=" + empID + "]";
	}

}
