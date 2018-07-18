package array2D;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix row: ");
		int row = sc.nextInt();
		System.out.println("Enter matrix columns: ");
		int col = sc.nextInt();

		int sum = 0;
		int maxSum = 0;
		int rowMaxSum = 0;
		int[][] matrix = new int[row][col];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter element [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
				while (matrix[i][j] <= 0) {
					System.out.println("Enter positive number for element [" + "][" + j + "]");
					matrix[i][j] = sc.nextInt();
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				
			}
			if (sum > maxSum) {
				maxSum = sum;
				rowMaxSum = i;
			}
			
			sum = 0;
		}
		System.out.println("The row with max sum is: " + rowMaxSum);
		System.out.println();
		for ( col = 0; col < matrix[rowMaxSum].length; col++) {
			System.out.print(matrix[rowMaxSum][col] + " ");
		}
	}

}
