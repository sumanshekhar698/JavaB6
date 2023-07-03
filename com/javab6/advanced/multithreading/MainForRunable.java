package com.javab6.advanced.multithreading;

public class MainForRunable {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START ###");

		
		Thread t2 = new Thread(new LoopWork());
		t2.setName("t2");
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());

		t2.join();
//		System.out.println(t2.getState());




		System.out.println("### END");
		System.out.println(t2.getState());


	}

}
