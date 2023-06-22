package com.javab6.oops.abstraction;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
//		new Bank();

		PNBBank pnbBank = new PNBBank();
		boolean bankClosedfToday = pnbBank.isBankClosedfToday();
		System.out.println(bankClosedfToday);

		Bank bank = new Bank() {//Annonummous inner class

			@Override
			boolean isBankClosedfToday() {

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
