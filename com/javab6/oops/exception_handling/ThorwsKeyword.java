package com.javab6.oops.exception_handling;

public class ThorwsKeyword {

	public static void main(String[] args) throws InterruptedException { // JAVA DEH

		call1();

	}

	private static void call1() throws InterruptedException {
		call2();
	}

	private static void call2() throws InterruptedException {
		call3();
	}

	private static void call3() throws InterruptedException {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
		System.out.println(0/0);
	}

}
