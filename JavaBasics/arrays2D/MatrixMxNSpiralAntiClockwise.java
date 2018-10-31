package array2D;

import java.util.Scanner;

public class MatrixMxNSpiralAntiClockwise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Value For Row :");
		int row = sc.nextInt();
		System.out.println("Enter The Value For Column :");
		int col = sc.nextInt();
		int[][] spiralMatrix = new int[row][col];
		int value = 1;
		int minCol = 0;
		int maxCol = col - 1;
		int minRow = 0;
		int maxRow = row - 1;

		while (value < row * col) {
			for (int i = minRow; i <= maxRow; i++) {
				spiralMatrix[i][minCol] = value;
				value++;
			}

			for (int i = minCol + 1 ; i <= maxCol; i++) {
				spiralMatrix[maxRow][i] = value;
				value++;
			}

			for (int i = maxRow- 1 ; i >= minRow; i--) {
				spiralMatrix[i][maxCol] = value;
				value++;
			}

			for (int i = maxCol - 1; i >= minCol + 1; i--) {
				spiralMatrix[minRow][i] = value;
				value++;
			}

			minCol++;
			minRow++;
			maxCol--;
			maxRow--;
		}
		for (int i = 0; i < spiralMatrix.length; i++) {
			for ( int j = 0; j < spiralMatrix[i].length; j++) {
				
				System.out.print(spiralMatrix[i][j] + "		");
			}
			System.out.println();
		}
	}

}
