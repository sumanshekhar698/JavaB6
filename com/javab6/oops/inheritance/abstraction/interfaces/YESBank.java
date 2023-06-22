package com.javab6.oops.inheritance.abstraction.interfaces;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class YESBank implements Bank, Forex {// A class can implement mutiple interfaces

	@Override
	public int moneyWithdrawl(int amount) {

		return 100;
	}

	@Override
	public boolean isBankClosedfToday() {
		LocalDate date = LocalDate.now();

		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println(dayOfWeek);
		if (dayOfWeek == DayOfWeek.SUNDAY)
			return true;
		return false;
	}

	@Override
	public float getExcehangeRate() {

		return 1.04f;
	}

	@Override
	public boolean giveFunds() {
		return false;
	}

}
