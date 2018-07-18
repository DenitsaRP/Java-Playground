package array2D;

public class Zad8 {

	public static void main(String[] args) {
		
		boolean[][] matrix = { // 3*3; n = 3 / i + j = n - 1
				{true, true, false},
				{false, true, false},
				{true, false, false}
		};
		boolean ima = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i + j > matrix.length - 1 ) {
					if (matrix[i][j] == true) {
						ima = true;
						break;
					}
				}
				
			}
		}
		System.out.println(ima? "Ima stojnost true":"Nqma true");
		}

	}

