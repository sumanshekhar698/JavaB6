package com.javab6.oops.inheritance.abstraction.interfaces;

public interface Bank {
	
	

	public static final String ifsc = "XXXXX";
	String regulatoryBank =  "RBI";
	
	int moneyWithdrawl(int amount) ;//abstract keyword is optional
	
	abstract boolean isBankClosedfToday();//abstarct methos are with no body


}
