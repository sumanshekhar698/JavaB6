package com.javab6.oops.strings.mutable;

public class BattleOfStrings {

	public static void main(String[] args) {

		// 1
		String x = "tom";

		long startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			x += "jerry";

		}
		long endTime = System.nanoTime();
		System.out.println("STRINGS => " + (endTime - startTime));// ns

		// 2
		StringBuilder sb = new StringBuilder("tom");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			sb.append("jerry");

		}
		endTime = System.nanoTime();
		System.out.println("STRING BUILDER => " + (endTime - startTime));// ns
//		STRINGS => 57,7060,300 = 0.057 seconds
//		STRING BUILDER => 452,800 = 0.0004 seconds

	}

}
