package com.javab6.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSort {

	public static void main(String[] args) {

		ArrayList<Student> studentRecord = new ArrayList<>();
		studentRecord.add(new Student(3, "Steve"));
		studentRecord.add(new Student(2, "Mary"));
		studentRecord.add(new Student(6, "Steve"));
		studentRecord.add(new Student(6, "May"));
		studentRecord.add(new Student(1, "John"));
		studentRecord.add(new Student(7, "Miley"));
		studentRecord.add(new Student(9, "Tom"));

		Collections.sort(studentRecord, new CustomAgeSorter());

		studentRecord.stream().forEach(System.out::println);

		ArrayList<Employee> employeeRecord = new ArrayList<>();
		employeeRecord.add(new Employee(3, "Steve"));
		employeeRecord.add(new Employee(2, "Mary"));
		employeeRecord.add(new Employee(6, "Steve"));

		Collections.sort(employeeRecord);
		employeeRecord.stream().forEach(System.out::println);


	}

}

class CustomAgeSorter implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.id == s2.id)
			return 0;
		else if (s1.id < s2.id)// descending
			return 1;
		else
			return -1;

	}

}
