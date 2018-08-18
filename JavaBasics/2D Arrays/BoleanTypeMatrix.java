package array2D;

//Write a program that, for a matrix with boolean type values, checks if an element over the second diagonal has value "true".

public class BoleanTypeMatrix {

	public static void main(String[] args) {

		boolean[][] matrix = { // 3*3; n = 3 / i + j = n - 1
				{ true, true, false }, { false, true, false }, { true, false, false } };
		boolean has = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i + j > matrix.length - 1) {
					if (matrix[i][j] == true) {
						has = true;
						break;
					}
				}

			}
		}
		System.out.println(has ? "There's truth value." : "There's no truth value.");
	}

}
