package com.javab6.oops.arrrays;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		
		int [][]  matrix= new int [4][3];//[rows][columns]
		
		System.out.println(Arrays.toString(matrix));
		
		//1
		
		for (int i = 0; i < matrix.length; i++) {//traverse through individual 1D arrays
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println(" ------------------------------------------------------------- \n\n");
		//2
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));

		}
		
		
		
		
		

	}

}
