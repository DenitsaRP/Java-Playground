package array2D;

import java.util.Scanner;

public class Practice11A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter matrix row: ");
		int row = sc.nextInt();
		
		System.out.println("Enter matrix columns:");
		int col = sc.nextInt();
		
		int[][] matrix = new int[row][col];
		int count = 1;
		for (int i = 0; i < matrix.length; i++) {
			for ( int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = count;
				count++;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
