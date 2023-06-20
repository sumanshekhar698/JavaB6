package com.javab6.oops.inheritance;

public class IPLPlayer extends Player{

	int age= 78;
	
	public IPLPlayer(String name, int age, Gender gender, boolean dopeTest) {
		super(name, age, gender, dopeTest);
//		System.out.println(secretKey);	
	}

	@Override
	public String toString() {//super keyword is use to access things of IMMEDIATE PARENT
		return "IPLPlayer [name=" + name + ", age=" + super.age + ", gender=" + gender + ", dopeTest=" + dopeTest + "]";
	}
	
	




}
