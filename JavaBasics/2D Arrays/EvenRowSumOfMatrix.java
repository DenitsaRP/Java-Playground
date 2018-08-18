package array2D;

import java.util.Scanner;

//You have pre-entered values of natural numbers in matrix 6x6;
//Write a program that calculate the sum of all elements from the rows with even numbers: 2,4 and 6.
//The program also prints on screen the sum of each row.

public class EvenRowSumOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("You have matrix with 6 rows and 6 columns");
		int[][] matrix = {{11,12,13,14,15,16},{21,22,23,24,25,26},
			{31,32,33,34,35,36},{41,42,43,44,45,46},{51,52,53,54,55,56},{61,62,63,64,65, 66}};

		System.out.println();

		int sum = 0;
		int sumTemp = 0;
		int sumTotal = 0;
		for (int i = 1; i <= matrix.length; i += 2) {
			for (int j = 0; j < matrix.length; j++) {
				if (j == (matrix.length - 1)) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print(matrix[i][j] + " , ");
				}
				sumTemp += matrix[i][j];
				if (j == matrix.length - 1) {
					sum = sumTemp;
					sumTotal += sum;
				}
			}
			System.out.print("The sum is: " + sum);
			sum = 0;
			sumTemp = 0;
			System.out.println();
		}
		System.out.println();
		System.out.println("The total sum is " + sumTotal);
	}

}
