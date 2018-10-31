package array2D;

import java.util.Scanner;

//Write a program that has pre - entered  integer elements in a  2-dimensional array - 4 * 4.
//The program on screen correlation by the  largest amount in rows ant the largest amount in columns.

public class CompareLargestSumInRowsAndColumns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter equal value for rows and columns for the matrix");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter positive number ");
			num = sc.nextInt();
		}

		int[][] matrix = new int[num][num];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("Enter element [" + i + "][" + j + "]");
				matrix[i][j] = sc.nextInt();
			}
		}

		int sumMaxRow = 0;
		int sumTempRow = 0;
		int sumMaxCol = 0;
		int sumTempCol = 0;
		

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
					sumTempRow += matrix[i][j];
					if (j == matrix.length - 1 && sumTempRow > sumMaxRow) {
						sumMaxRow = sumTempRow;
						sumTempRow = 0;
					}
					sumTempCol += matrix[j][i];
					if (j == matrix.length - 1 && sumTempCol > sumMaxCol) {
						sumMaxCol = sumTempCol;
						sumTempCol = 0;
					}
				}
			}
		System.out.println();
		for (int i = 0;  i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == matrix.length - 1) {
					System.out.print(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + " , ");
				}
				
			}
			System.out.println();
		}
		System.out.println("The max row sum is: " + sumMaxRow);
		System.out.println("The max colomn sum is: " + sumMaxCol);
		if (sumMaxRow > sumMaxCol) {
			System.out.println("The max Row sum > than max sum Columns");
		} else {
			System.out.println("The max Row sum > than max sum Columns");
		}
		}
		
	}

