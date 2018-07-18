package array;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length:");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("Enter new positive array length:");
			num = sc.nextInt();
		}

		int array[] = new int[num];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter elemnt" + (i + 1));
			array[i] = sc.nextInt();
		}
		int arrayNew[] = new int[array.length];
		// System.out.println("arraynew[0] : "+ arrayNew[0]);
		// System.out.println("array[0] : "+ array[0]);
		// arrayNew[0]++;
		// System.out.println("arraynew[0] : "+ arrayNew[0]);
		// System.out.println("array[0] : "+ array[0]);
		if (num % 2 == 0) {

			for (int i = 0; i < (array.length / 2); i++) {
				arrayNew[i] = array[i];
			}

			for (int i = (array.length / 2) - 1, j = array.length / 2; i >= 0; i--, j++) {
				arrayNew[j] = array[i];
			}
			for (int i = 0; i < arrayNew.length; i++) {
				System.out.print(arrayNew[i] + " ");
			}
		} else {
			for ( int i = 0; i < array.length/2; i++) {
				arrayNew[i] = array [i];
			}
			arrayNew[array.length/2] = array[array.length/2];
			for (int i = (array.length/2) - 1, j = (array.length/2) + 1; i >= 0; i--, j++) {
				arrayNew[j] = array[i];
			}
			for (int i = 0; i < arrayNew.length; i++) {
				System.out.print(arrayNew[i] + " ");
			}
			
		}
	}

}
