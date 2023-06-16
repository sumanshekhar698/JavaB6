package com.javab6.oops.encapulation.static_concepts;

public class MainSingelton {

	public static void main(String[] args) {

//		President p1 = new President("Joe Biden",65);
//		President p1 = new President("Joe Biden FAKE ",65);
		
		President p1 = President.createPresident("Joe Biden", 74);
		System.out.println(p1);
		System.out.println(p1.hashCode());
		
		President p2 = President.createPresident("Joe Liden", -66);
		System.out.println(p2);
		System.out.println(p2.hashCode());



	}

}
