package com.javab6.oops.bascis;

public class Main {

	public static void main(String[] args) {

//		int x;
//		System.out.println(x);
		Animal an1 = new Animal();
		System.out.println(an1);
		System.out.println(an1.weight);
		
		an1.sleep();
		int roam = an1.roam();
		System.out.println(roam);
	}

}
