package array2D;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("the matrix iss square");
		System.out.println("Eneter value of rows and columns:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enetr positive number");
			num = sc.nextInt();
		}

		int[][] matrix = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println("Eneter element: [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i + j == matrix.length - 1) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ( j == matrix.length - 1) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print(matrix[i][j] + " , ");
				}
			}
			System.out.println();

		}

	}

}
