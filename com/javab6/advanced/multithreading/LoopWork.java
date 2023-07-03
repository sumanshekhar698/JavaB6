package com.javab6.advanced.multithreading;


//2. 
public class LoopWork implements Runnable{
	//1. Using Thread Class : Worker with a work
	//2. Runnable is just a Work

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i + " => " + Thread.currentThread());

				Thread.sleep(500);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
