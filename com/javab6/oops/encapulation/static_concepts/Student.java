package com.javab6.oops.encapulation.static_concepts;

public class Student {

	String name;
	int id;
//	static String collegeName="DTU";// static things are not object level they are classlevel variables
	static String collegeName;//null
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
//		System.out.println(collegeName);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	

}
