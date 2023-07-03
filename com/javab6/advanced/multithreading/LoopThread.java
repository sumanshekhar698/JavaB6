package com.javab6.advanced.multithreading;

// 1 -  Using Thread CLASS
public class LoopThread extends Thread {

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
