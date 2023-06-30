package com.javab6.advanced.io.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	int id;
	transient String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
