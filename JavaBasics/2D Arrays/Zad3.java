package array2D;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("The columns and rows are equal in matrix: ");
		System.out.println("Eneter their value: ");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positve number");
			num = sc.nextInt();
		}

		int sum = 0;
		int[][] matrix = new int[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println("Eneter element [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j == matrix.length - 1) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print(matrix[i][j] + " , ");
				}

			}
			System.out.println();
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				sum += matrix[i][j];
			}
		}
		int avarage = sum / (num * num);
		System.out.println();
		System.out.println("The sum is: " + sum);
		System.out.println("The avarage value is: " + avarage);
	}

}
