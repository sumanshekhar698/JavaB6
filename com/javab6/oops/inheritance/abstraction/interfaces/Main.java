package com.javab6.oops.inheritance.abstraction.interfaces;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		new Bank() {

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
		};
	}

}
