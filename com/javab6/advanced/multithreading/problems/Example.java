package com.javab6.advanced.multithreading.problems;

import java.util.Iterator;

class Line {

	synchronized public void getLine() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println(i + " => " + Thread.currentThread());
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class Control extends Thread {

	Line line;

	public Control(Line line) {
		super();
		this.line = line;
	}

	@Override
	public void run() {
		line.getLine();
	}

}

public class Example {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("START <<<");
		Line line = new Line();

		Control c1 = new Control(line);
		c1.setName("c1");
		System.out.println(c1.getState());

		Control c2 = new Control(line);
		c2.setName("c2");
		System.out.println(c2.getState());


		c1.start();
		c2.start();
		
		System.out.println(c1.getState());
		System.out.println(c2.getState());
		
		c1.join();
		c2.join();
		
		System.out.println(c1.getState());
		System.out.println(c2.getState());
		System.out.println("END >>>");


		
	}

}
