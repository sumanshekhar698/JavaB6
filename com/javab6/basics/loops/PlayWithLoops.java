package com.javab6.basics.loops;

public class PlayWithLoops {

	public static void main(String[] args) {

		// 1- 100 : multiples of 5 to be skipped

		for (int i = 1; i <= 100; i++) {
//			if (!(i % 5 == 0))
//			if (i % 5 != 0)
			if (i % 5 == 0)
				continue;

			if (i == 78)
				break;
			
			System.out.println(i);

		}

	}

}
