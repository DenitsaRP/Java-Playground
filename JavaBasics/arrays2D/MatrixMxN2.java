package array2D;

import java.util.Scanner;

//Write a program that requires from the user to enter 2 numbers n and m. Print on screen matrix of size n x m.
//1  4 	7 	10 	
//2  5 	8 	11 	
//3  6 	9 	12 

public class MatrixMxN2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter matrix row: ");
		int row = sc.nextInt();

		System.out.println("Enter matrix columns:");
		int col = sc.nextInt();

		int[][] matrix = new int[row][col];
		int count = 1;
		int minRow = 0;
		int minCol = 0;

		while (count <= row * col) {
			for (int i = minRow; i <= row-1; i++) {
				matrix[i][minCol] = count;
				count++;
			}
			minCol++;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " 	");
			}
			System.out.println();
		}
	}

}
