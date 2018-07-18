package array2D;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Matrix with equal rows and columns:");
		System.out.println("Enter matrix size:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number");
			num = sc.nextInt();
		}

		int[][] matrix = new int[num][num];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("Enter element [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
				while (matrix[i][j] <= 0) {
					System.out.println("Enter positive number for element  [" + i + "][" + j + "]");
					matrix[i][j] = sc.nextInt();
				}
			}

		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (j == matrix.length - 1) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print(matrix[i][j] + " , ");
				}
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = matrix.length - 1; j >= 0; j--) {
				if (j == 0) {
					System.out.print(matrix[j][i] + " ");
				} else {
					System.out.print(matrix[j][i] + " , ");
				}
			}
			System.out.println();
		}
	}

}
