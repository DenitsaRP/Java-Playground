package array2D;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows of the matrix");
		int row = sc.nextInt();
		
		System.out.println("Enter colunms of the matrix");
		int  col = sc.nextInt();
		
		int[][] matrix = new int[row][col];
		for (int i = 0; i < matrix.length; i++) {
			for ( int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter element [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
				while ( matrix[i][j] <= 0) {
					System.out.println("Enter positive number [" + i + "][" + j + "]");
					matrix[i][j] = sc.nextInt();
				}
			}
		}
		int multiply = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j < i ) {
					multiply *= matrix[i][j];
				}
			}
		}
		System.out.println("The matrix is : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] +  " ");
			}
			System.out.println();
		}
		
		System.out.println("The multiply under the prime diagonal is " + multiply);
	}

}
