package com.javab6.oops.encapulation;

public class AadharCard {//Access Modifiers
	String name;
	 long aadharNo;
	private String dob;//private things can be acesd ONLY from within the class
	
	//setters and getters
	public String getDob() {//GETTER
		return dob;
	}


//	public void setDob(String dob) {
//		this.dob = dob;
//	}
	
	
	public AadharCard(String name, long aadharNo, String dob) {
//		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.dob = dob;
	}





	@Override
	public String toString() {
		return "AadharCard [name=" + name + ", aadharNo=" + aadharNo + ", dob=" + dob + "]";
	}
	
	
	

}
