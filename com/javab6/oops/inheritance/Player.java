package com.javab6.oops.inheritance;

public class Player extends Object{
//	public class Player {
	String name;
	int age;
	Gender gender;
	boolean dopeTest;
	private int secretCode;//private things are not inherited
	
	public Player(String name, int age, Gender gender, boolean dopeTest) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dopeTest = dopeTest;
	}



	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", gender=" + gender + ", dopeTest=" + dopeTest + "]";
	}
	
	void sayMyName(){
		System.out.println("PLAYER ==> "+name);
	}
	
	
	

}

enum Gender {
	male, female
}
