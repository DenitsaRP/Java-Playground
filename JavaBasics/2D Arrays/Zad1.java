package array2D;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("The matrix is with 6 rows and 5 columns");

		int[][] matrix = new int[6][5];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Enete element of the matrix [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				} else if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}

		}
		System.out.println("The max value is: " + max);
		System.out.println("The min value is: " + min);
	}

}
