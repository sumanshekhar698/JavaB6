package com.javab6.oops.abstraction;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PNBBank extends Bank {

	@Override
	boolean isBankClosedfToday() {

		LocalDate date = LocalDate.now();

		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println(dayOfWeek);
		if (dayOfWeek == DayOfWeek.SUNDAY)
			return true;
		return false;
	}

}
