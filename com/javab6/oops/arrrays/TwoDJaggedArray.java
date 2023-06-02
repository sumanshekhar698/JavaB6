package com.javab6.oops.arrrays;

public class TwoDJaggedArray {

	public static void main(String[] args) {

		int[][] twoDMatJagged = { { 3, 4, 56, 6 }, { 4, 34, 44, 34, 3434, 4 }, { 23, -32, 3 } };

		for (int i = 0; i < twoDMatJagged.length; i++) {
			for (int j = 0; j < twoDMatJagged[i].length; j++) {
				System.out.print(twoDMatJagged[i][j] + " ");

			}
			System.out.println();

		}

		int[][] mat2Jagged = new int[3][0];// 3 * 0 //An 1D arrray can have zero length
//		mat2Jagged[0] = new int[4];
//		mat2Jagged[1] = new int[6];
//		mat2Jagged[2] = new int[3];

		for (int i = 0; i < mat2Jagged.length; i++) {
			for (int j = 0; j < mat2Jagged[i].length; j++) {
				System.out.print(mat2Jagged[i][j] + " ");

			}
			System.out.println();

		}
	}

}
