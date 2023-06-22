package com.javab6.oops.inheritance.abstraction.interfaces_types;

public class Main {

	public static void main(String[] args) {

		Cow cow = new Cow();
		cow.isOmnivore();

		Animal buffalo = new Animal() {// 2. Annomyous inner class

			@Override
			public boolean isOmnivore() {
				System.out.println(false);
				return false;
			}
		};

		// 3. Lamda Fn (But take care that inmterface in a Functional Interface)
		Animal goat = () -> {
			return true;
		};

	}

}

class Cow implements Animal {// 1

	@Override
	public boolean isOmnivore() {
		System.out.println(false);
		return false;
	}

}
