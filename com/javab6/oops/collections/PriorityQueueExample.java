package com.javab6.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue0 = new PriorityQueue();// MIN HEAP
		PriorityQueue<Integer> priorityQueue = new PriorityQueue(Collections.reverseOrder());// MAX HEAP
		priorityQueue.add(56);
		priorityQueue.add(43);
		priorityQueue.add(34);
		priorityQueue.add(76);
		priorityQueue.add(23);
		priorityQueue.add(24);

		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);

	}

}
