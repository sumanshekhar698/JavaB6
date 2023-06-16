package com.javab6.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		IPLPlayer virat = new IPLPlayer("Virat Kohli", 45, Gender.male, false);
		System.out.println(virat);
		virat.sayMyName();

		FifaPlayer ronaldo = new FifaPlayer("Ronaldo", 50, Gender.male, false);
		System.out.println(ronaldo);
		ronaldo.sayMyName();
	}

}
