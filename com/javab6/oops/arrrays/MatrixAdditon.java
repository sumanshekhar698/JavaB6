package com.javab6.oops.arrrays;

import java.util.Arrays;

public class MatrixAdditon {//Matrix Multi

	public static void main(String[] args) {

		// the two 2D matrix are symmetric
		int[][] mat1 = { { 4, 6, 22 }, { 343, -99, 2 }, { 44, 53, 5 }, { 44, 53, 5 } };// 4*3

		int[][] mat2 = { { 4, 16, 822 }, { 33, -29, 2 }, { 4, 51, 545 } };// 3*3

		if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {
			int[][] matResult = new int[mat1.length][mat1[0].length];

			for (int i = 0; i < matResult.length; i++) {
				for (int j = 0; j < matResult[i].length; j++) {
					matResult[i][j] = mat1[i][j] + mat2[i][j];

				}

			}

			for (int i = 0; i < matResult.length; i++) {
				System.out.println(Arrays.toString(matResult[i]));

			}

		} else {
			System.out.println("Dimensions mismatch | not eligible for adding");
		}

	}

}
