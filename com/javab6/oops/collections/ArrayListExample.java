package com.javab6.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		int[] arr = { 32, 43, 4, 31, 4, 234, 87 };

		// Collection Framework - can hold object

//		ArrayList
		ArrayList list1 = new ArrayList();
		list1.add(4);// 0
		list1.add(true);// 1
		list1.add(new ArrayList());// 2
		System.out.println(list1);

		list1.remove(0);
		System.out.println(list1);

		ArrayList<Integer> list2 = new <Integer>ArrayList();
		list2.add(4);
		list2.add(43);// Objects (Wraper classes)
		list2.add(62);
		list2.add(42);

		for (int i = 0; i < list2.size(); i++) {// most horrible way to traverse
			System.out.print(list2.get(i) + " | ");
//			list2.add(list2.get(i));//never mutate the collection while traversing
		}

		System.out.println();

		for (Integer num : list2) {// good loop
			System.out.print(num + " | ");
//			list2.add(7);// never mutate the collection while traversing
		}

		System.out.println();
		Iterator<Integer> iterator = list2.iterator();
		while (iterator.hasNext()) {
			Integer num = (Integer) iterator.next();
			System.out.print(num + " | ");
		}

		System.out.println();
		System.out.println();

		list2.stream().forEach(System.out::println);
		
		
		System.out.println();
		Collections.sort(list2);
		list2.stream().forEach(System.out::println);
		
		System.out.println();
		Collections.sort(list2,Collections.reverseOrder());
		list2.stream().forEach(System.out::println);
		
		list2.clear();
		System.out.println(list2.isEmpty());
		System.out.println(list2);



	}

}
