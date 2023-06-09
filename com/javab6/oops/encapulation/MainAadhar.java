package com.javab6.oops.encapulation;

public class MainAadhar {

	public static void main(String[] args) {
		
		AadharCard a1 = new AadharCard("Shyam", 67696960, "08-78-67");
		System.out.println(a1);
		
		AadharCard a2 = new AadharCard("Shyam", 67696960, "08-78-67");
		System.out.println(a2);
//		a2.dob="YOLO";
		
		System.out.println(a2);
//		a2.setDob("YOLO");
		System.out.println(a2.getDob());

		
//		AadharCard a3 = a1;
//		System.out.println(a3);
	
	}
}
