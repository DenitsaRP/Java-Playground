package array2D;

import java.util.Scanner;

//Write a program that, for a given integer matrix, prints on the screen the elements that are in the prime diagonal.

public class MatrixPrimeDiagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter matrix row");
		int row = sc.nextInt();
		while (row <= 0) {
			System.out.println("Enter positive number for row!");
			row = sc.nextInt();
		}
		
		System.out.println("Enter matrix column:");
		int col = sc.nextInt();
		while (col <= 0) {
			System.out.println("Enter positive number for columns");
			col = sc.nextInt();
		}
		
		int[][] matrix = new int [row][col];
		for (int i = 0; i < matrix.length; i++) {
			for ( int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter element [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("---------");
		//only one loop
		for ( int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}

	}

}
