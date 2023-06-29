package com.javab6.oops.collections;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee et) {
		if (et.id == this.id)
			return 0;
		else if (et.id > this.id)
			return 1;
		else
			return -1;
	}

}
