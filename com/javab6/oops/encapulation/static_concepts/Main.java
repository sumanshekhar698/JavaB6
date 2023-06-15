package com.javab6.oops.encapulation.static_concepts;

public class Main {

	public static void main(String[] args) {


		
		System.out.println(Student.collegeName);//Static things can be directly sccessed via class name
		
		
		Student st1 = new Student("Lalit",5);
		Student st2 =new Student("Lalit",6);
		
		
		st1.name = "Kiran";
		System.out.println(st2.name);
		
		st1.collegeName = "IIIT";
		System.out.println(st1.collegeName);//IIIT
		System.out.println(st2.collegeName);//IIIT
		
		Student st3 = new Student("Marry",67);
		System.out.println( st3.collegeName);//IIIT


	}

}
