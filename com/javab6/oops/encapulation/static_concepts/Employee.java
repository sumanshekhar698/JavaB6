package com.javab6.oops.encapulation.static_concepts;

import java.util.Scanner;

public class Employee {

	String name;
	int empID;
	static String companyName;
	static Scanner sc = new Scanner(System.in);
	
	static {//static things are the first one to be loaded in the memory
		//Do some operation
		companyName = "GOOGLE";
		System.out.println("STATIC BLOCK EXECUTED");
//		System.out.println(name);// Manta 2. Non Static things are not directly accessed from static things 
	}

	public Employee(String name, int empID) {
//		super();
		System.out.println("EMPLOYEE CONST called");
		this.name = name;
		this.empID = empID;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + "]";
	}
	
//	static void callOutMyNameANdID() {
//		System.out.println("Employee [name=" + name + ", empID=" + empID + "]";);
//	}
	
	static void showMyCompanyName() {
		System.out.println("COMPANY --> "+companyName);
	}

}
