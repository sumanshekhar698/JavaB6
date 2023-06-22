package com.javab6.oops.exception_handling;

public class MainExample {

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println("START");
		int arr[] = { 1, 2, 3, 4, 5 };
		
		try {//handlimg Exception
			System.out.println(arr[5]);//ArrayInexOutOfBound Exception

		} catch (Exception e) {
			System.out.println(e);
		}

//		call();// ? Error : java.lang.StackOverflowError
		
		System.out.println("END");

	}

	static void call() {
		System.out.println("Calling" + ++counter);
		call();
	}
}
