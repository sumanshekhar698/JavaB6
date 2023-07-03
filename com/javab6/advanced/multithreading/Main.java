package com.javab6.advanced.multithreading;

public class Main {

	public static void main(String[] args) {

		System.out.println("START");
		LoopThread t1 = new LoopThread();
		t1.setName("t1");		
		t1.start();//5 is the default priorit

		LoopThread t2 = new LoopThread();
		t2.setName("t2");		
		t2.start();
		t2.setPriority(6);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);

		System.out.println("END");

	}

}
