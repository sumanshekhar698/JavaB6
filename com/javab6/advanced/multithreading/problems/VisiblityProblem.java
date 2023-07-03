package com.javab6.advanced.multithreading.problems;

public class VisiblityProblem {
	
	private volatile static boolean ready = false;//volatile will not guaranetee
	private static int number = 0;
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
			number = 100;
			ready = true;
		});
		
		Thread t2 = new Thread(()->{
			while (!ready) {
				System.out.println("STOP ME");
			}
			System.out.println(number);
		});
		
		t2.start();
		t1.start();
		
	}

}
