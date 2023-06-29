package com.javab6.oops.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Integer> setOfNums = new HashSet<Integer>();
		setOfNums.add(5);
		setOfNums.add(15);
		setOfNums.add(55);
		setOfNums.add(5);
		setOfNums.add(55);
		setOfNums.add(55);
		setOfNums.add(15);
		
		setOfNums.add(43);
		setOfNums.add(453);
		setOfNums.add(4);
		setOfNums.add(2);
		setOfNums.add(1);
		
		
		System.out.println(setOfNums);
		
		boolean contains = setOfNums.contains(4);//searching is very fast HASHING
		System.out.println(contains);
		
		for (Integer num : setOfNums) {
			System.out.println(num);
		}
		

	}

}
