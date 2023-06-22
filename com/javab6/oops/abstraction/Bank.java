package com.javab6.oops.abstraction;

abstract public class Bank {// 0 - 100% partial abtraction

	String ifsc;
	String bankName;
	int pinCode;
	int balance;

	int moneyWithdrawl(int amount) {//concrete methods
		if (balance < amount) {
			System.out.println("Low balance");
			return 0;

		} else {
			System.out.println("With drawing " + amount);
			balance -= amount;
			return amount;

		}

	}
	
	abstract boolean isBankClosedfToday();//abstarct methos are with no body

}
