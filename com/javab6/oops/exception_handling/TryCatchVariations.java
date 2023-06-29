package com.javab6.oops.exception_handling;

import java.util.Scanner;

public class TryCatchVariations {

	public static void main(String[] args) {

		System.out.println("START");

		int[] arr = { 3, 34, 45, 5, 0 };
		Scanner scanner = new Scanner(System.in);

		// try catch pair
		try {
//			System.out.println(6 / 0);//AtithmeticException - UncheckdException - optional handling

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		// try multiple catches
		try {
			System.out.println(6 / arr[arr.length]);// AtithmeticException - UncheckdException - optional handling

		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// try catch ..catch finally
		try {
			System.out.println(0 / scanner.nextInt());
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {// resource closiung operations
			scanner.close();
			System.out.println("closed");
		}

		// try finally
		try {

		} finally {

		}

		// try with resource
		try (Scanner sc = new Scanner(System.in);) {//public interface Closeable extends AutoCloseable {
			//classes that are child of AutoCloseable can be auto closed in  try with resource
			System.out.println(0 / sc.nextInt());
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("END");

	}

}
