package com.javab6.oops.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// K:V
//		id : Name

		ArrayList<Student> studentRecord = new ArrayList<>();
		studentRecord.add(new Student(3, "Steve"));
		studentRecord.add(new Student(2, "Mary"));
		studentRecord.add(new Student(6, "Steve"));

		System.out.println(studentRecord);

		HashMap<Integer, String> hashMapOfStudnet = new HashMap<>();// K:V Key is the main thing as it will be hashed
		hashMapOfStudnet.put(3, "Steve");// Keys cannot be duplicate
		hashMapOfStudnet.put(2, "Mary");

		hashMapOfStudnet.put(6, "Steve");// K:V --> Entry
		hashMapOfStudnet.put(2, "John");
		System.out.println(hashMapOfStudnet);

//		for (Map.Entry<keyType, valType> entry : map.entrySet()) {
//			keyType key = entry.getKey();
//			valType val = entry.getValue();
//
//		}

		Set<Entry<Integer, String>> entrySet = hashMapOfStudnet.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		Set<Integer> keySet = hashMapOfStudnet.keySet();
		Collection<String> values =  hashMapOfStudnet.values();


		hashMapOfStudnet.remove(6);
		System.out.println(hashMapOfStudnet);
		
		boolean containsKey = hashMapOfStudnet.containsKey(3);
		System.out.println(containsKey);

		

	}

}

