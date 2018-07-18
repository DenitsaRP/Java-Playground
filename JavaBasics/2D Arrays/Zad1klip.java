package array2D;

import java.util.Scanner;

public class Zad1klip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of colums: ");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];
		// reading from console
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Please enter value for cell: [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}
		//writing 
		System.out.println("Your matrix lookslike this:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (j == cols - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + " , ");
				}
			}
			System.out.println();

		}
	}
}
