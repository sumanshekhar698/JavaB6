package com.javab6.oops.exception_handling;

public class ExceptionsExample {

	public static void main(String[] args) {
		// UNCHECKED
		System.out.println("START");// comilation errors?

		try {
			System.out.println(6 / 0);//AtithmeticException - UncheckdException - optional handling

		} catch (Exception e) {
			// TODO: handle exception
		}
//		System.out.println(-6 / 0.0);/// 0.0 == 0
//		System.out.println(0 / 0.0);
//		System.out.println(0.0f == 0);
		
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {//Checked Exception - must handling
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("END");
		

	}

}
